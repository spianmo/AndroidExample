package com.kirito.androidexample;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kirito.androidexample.bean.User;

public class Jump2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump2);
        TextView tv = findViewById(R.id.tv_desc);
        //User user = (User) getIntent().getSerializableExtra("user");
        Bundle bundle = getIntent().getExtras();
        User user = (User) bundle.getSerializable("user");
        tv.setText(user.name);
    }
}