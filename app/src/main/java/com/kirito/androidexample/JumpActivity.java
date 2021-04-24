package com.kirito.androidexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kirito.androidexample.base.BaseActivity;
import com.kirito.androidexample.databinding.ActivityJumpBinding;

public class JumpActivity extends BaseActivity<ActivityJumpBinding> {

    private final ActivityResultLauncher<String> launcher = registerForActivityResult(new ResultContract(), new ActivityResultCallback<String>() {
        @Override
        public void onActivityResult(String result) {
            Toast.makeText(JumpActivity.this, result, Toast.LENGTH_SHORT).show();
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
        v.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*                Intent intent = new Intent(JumpActivity.this,Jump2Activity.class);
                User user = new User();
                user.name = "唐钱进";
                user.age = 22;
                //intent.putExtra("user",user);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user",user);
                intent.putExtras(bundle);
                startActivity(intent);*/
                launcher.launch("传递字符串");
            }
        });
    }

    static class ResultContract extends ActivityResultContract<String, String> {

        @NonNull
        @Override
        public Intent createIntent(@NonNull Context context, String input) {
            return null;
        }

        @Override
        public String parseResult(int resultCode, @Nullable Intent intent) {
            return intent.getStringExtra("s");
        }
    }
}