package com.kirshi.fragment.fish;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kirshi.fragment.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(v.getRoot());
        String num1 = getIntent().getStringExtra("num1");
        String num2 = getIntent().getStringExtra("num2");
        v.textView.setText(Integer.valueOf(num1) + Integer.valueOf(num2));
    }
}