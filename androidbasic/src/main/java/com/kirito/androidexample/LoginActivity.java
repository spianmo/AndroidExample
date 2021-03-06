package com.kirito.androidexample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.eminayar.panter.PanterDialog;
import com.google.android.material.textfield.TextInputEditText;
import com.kirito.androidexample.widget.bling.Bling;
import com.kirito.androidexample.widget.bling.BlingType;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoginActivity extends AppCompatActivity {

    private Bling mBling;
    int[] colors = new int[]{
            Color.parseColor("#F44336"),
            Color.parseColor("#3F51B5"),
            Color.parseColor("#009688"),

            Color.parseColor("#E91E63"),
            Color.parseColor("#2196F3"),
            Color.parseColor("#5AB963"),
            Color.parseColor("#FFC107"),

            Color.parseColor("#9C28B0"),
            Color.parseColor("#03A9F4"),
            Color.parseColor("#8BC34A"),
            Color.parseColor("#FF9800"),

            Color.parseColor("#673AB7"),
            Color.parseColor("#00BCD4"),
            Color.parseColor("#CDDC39"),
            Color.parseColor("#FF5722"),
    };
    private String TAG = LoginActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBling = new Bling.Builder((ViewGroup) getWindow().getDecorView())
                .setDuration(6000)
                .setShapeCount(66)
                .setRadiusRange(10, 20)
                .setRotationSpeedRange(-3f, 3f)
                .setAutoHide(true)
                .setColors(colors)
                .setSpeedRange(0.2f, 0.6f)
                .setRotationRange(90, 150)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .build();
        PanterDialog panterDialog = new PanterDialog(this)
                .setHeaderBackground(R.drawable.pattern_bg_yellow)
                .setTitle("Happy Birthday???")
                .setPositive("I GOT IT")
                .setNegative("Cancel")
                .setMessage("Happy Birthday,\nShinonon. O(???_???)O~\n" +
                        "???????????????????????????")
                .isCancelable(false);
        panterDialog.setOnDismissListener(dialog -> {
            mBling.show(BlingType.TRIANGLE);
            dialog.dismiss();
        });
        panterDialog.show();
        TextInputEditText edUserName = findViewById(R.id.ed_username);
        TextInputEditText edPassword = findViewById(R.id.ed_pwd);
        Button loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(v -> {
            final String username = edUserName.getText().toString();
            final String password = edPassword.getText().toString();
            Log.e(TAG, "?????????:" + username + " ?????????:" + password);
            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "???????????????????????????", Toast.LENGTH_SHORT).show();
            } else {
                if (username.equals("root") && password.equals("root")) {
                    Intent intent = new Intent(this, InfoActivity.class);
                    intent.putExtra("username", username);
                    intent.putExtra("password", password);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(this, "????????????????????????", Toast.LENGTH_SHORT).show();
                    edPassword.setText("");
                    edPassword.requestFocus();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBling.release();
    }

    private void copyFile(Context context, String fileName) {
        InputStream in = null;
        FileOutputStream out = null;
        String path = context.getFilesDir().getAbsolutePath();
        File file = new File(path + fileName);

        File filePath = new File(path);
        if (!filePath.exists())
            filePath.mkdirs();

        if (file.exists())
            return;

        try {
            in = context.getAssets().open(fileName);
            out = new FileOutputStream(file);
            int length = -1;
            byte[] buf = new byte[1024];
            while ((length = in.read(buf)) != -1) {
                out.write(buf, 0, length);
            }
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}