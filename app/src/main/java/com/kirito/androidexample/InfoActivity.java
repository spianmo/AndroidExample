package com.kirito.androidexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity implements CheckBox.OnCheckedChangeListener {

    EditText edName, edPhone;
    RadioGroup rgGender;
    CheckBox cbJava, cbAndroid, cbEnglish, cbMath;
    Button btnReg;
    boolean isMan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        edName = findViewById(R.id.ed_name);
        edPhone = findViewById(R.id.ed_phone);
        rgGender = findViewById(R.id.rg_gender);
        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                isMan = checkedId == R.id.man;
            }
        });
        cbJava = findViewById(R.id.cb_java);
        cbAndroid = findViewById(R.id.cb_android);
        cbEnglish = findViewById(R.id.cb_english);
        cbMath = findViewById(R.id.cb_math);
        cbJava.setOnCheckedChangeListener(this);
        cbAndroid.setOnCheckedChangeListener(this);
        cbEnglish.setOnCheckedChangeListener(this);
        cbMath.setOnCheckedChangeListener(this);
        btnReg = findViewById(R.id.btn_reg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.cb_java:

                break;
            case R.id.cb_english:

                break;
            case R.id.cb_android:

                break;
            case R.id.cb_math:

                break;
        }
    }
}