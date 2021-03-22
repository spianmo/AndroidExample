package com.kirito.androidexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

/**
 * @author Finger
 */
public class BmiActivity extends AppCompatActivity {

    private TextInputEditText edWeight, edHeight;
    private TextView tvResult;
    private Button btnCau;
    private RadioGroup rgGender;
    private boolean isMan;

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        tvResult = findViewById(R.id.tv_result);
        rgGender = findViewById(R.id.rg_gender);
        rgGender.setOnCheckedChangeListener((group, checkedId) -> isMan = (checkedId == R.id.man));
        btnCau = findViewById(R.id.btn_cau);
        btnCau.setOnClickListener(v -> {
            String weight = edWeight.getText().toString();
            String height = edHeight.getText().toString();
            if (TextUtils.isEmpty(weight) || TextUtils.isEmpty(height)) {
                Toast.makeText(this, "请填写完整您的体重身高！", Toast.LENGTH_SHORT).show();
                return;
            }
            Double bmi;
            try {
                bmi = calculateBmi(Double.parseDouble(weight), Double.parseDouble(height));
            } catch (NumberFormatException ignored) {
                Toast.makeText(this, "请正确填写体重身高格式!", Toast.LENGTH_SHORT).show();
                return;
            }
            tvResult.setText("BMI： " + String.format("%.2f", bmi) + "\n诊断：" + processBmi(!isMan ? bmi + 1 : bmi));
        });
    }

    private Double calculateBmi(Double weight, Double height) {
        return weight / Math.pow(height, 2);
    }

    private static final String[] WEIGHT_DETAILS = new String[]{
            "体重过轻", "体重正常", "体重超重", "轻度肥胖", "中度肥胖", "重度肥胖"
    };

    private String processBmi(Double bmi) {
        if (bmi < 20) {
            return WEIGHT_DETAILS[0];
        }
        if (bmi >= 20 && bmi < 25) {
            return WEIGHT_DETAILS[1];
        }
        if (bmi >= 25 && bmi < 27) {
            return WEIGHT_DETAILS[2];
        }
        if (bmi >= 27 && bmi < 30) {
            return WEIGHT_DETAILS[3];
        }
        if (bmi >= 30 && bmi < 35) {
            return WEIGHT_DETAILS[4];
        }
        if (bmi >= 35) {
            return WEIGHT_DETAILS[5];
        }
        return "未知错误";
    }
}