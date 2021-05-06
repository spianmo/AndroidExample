package com.kirshi.dialog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;

import com.kirshi.dialog.base.BaseActivity;
import com.kirshi.dialog.databinding.ActivityResultBinding;

/**
 * @author Finger
 */
public class ResultActivity extends BaseActivity<ActivityResultBinding> {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Bundle nums = intent.getBundleExtra("nums");

        String num1 = nums.getString("num1");
        String num2 = nums.getString("num2");

        try {
            v.tvResult.setText(num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
        } catch (NumberFormatException e) {
            v.tvResult.setText("数字格式错误");
            showSnackBar("数字格式错误");
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}