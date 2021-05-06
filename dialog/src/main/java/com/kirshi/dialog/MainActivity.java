package com.kirshi.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.kirshi.dialog.base.BaseActivity;
import com.kirshi.dialog.databinding.ActivityMainBinding;
import com.kirshi.dialog.dialog.CalculatorDialog;
import com.kirshi.dialog.dialog.LoginDialog;
import com.kirshi.dialog.fragment.LifecycleFragment;

/**
 * @author Finger
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    public static boolean isFilter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TASK 1：ActivityJump And PassValue
        v.btnJump.setOnClickListener(view -> {
            String num1 = v.edNum1.getText().toString();
            String num2 = v.edNum2.getText().toString();
            Intent intent = new Intent(this, ResultActivity.class);
            Bundle nums = new Bundle();
            nums.putString("num1", num1);
            nums.putString("num2", num2);
            intent.putExtra("nums", nums);
            startActivity(intent);
        });

        //TASK 2：Fragment LifeCycle
        LifecycleFragment fragment = new LifecycleFragment();
        fragment.setActionCallback(() -> {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
            v.btnShowFragment.setVisibility(View.VISIBLE);
        });
        v.btnShowFragment.setOnClickListener(view -> {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
            view.setVisibility(View.GONE);
        });

        //TASK 3：PassValue With DialogFragment
        v.btnCallDialog.setOnClickListener(view -> {
            CalculatorDialog dialog = new CalculatorDialog();
            dialog.show(getSupportFragmentManager(), "calDialog");
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.login) {
/*            DelFragment dialog = new DelFragment();
            dialog.show(getSupportFragmentManager(), "删除");*/
            LoginDialog loginDialog = new LoginDialog();
            loginDialog.setOnLoginInputListener(new LoginDialog.OnLoginCallback() {
                @Override
                public void onCallback(String username, String password) {
                    Toast.makeText(MainActivity.this, username + "\n" + password, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onCancel(DialogFragment dialog) {
                    Toast.makeText(MainActivity.this, "登录取消", Toast.LENGTH_SHORT).show();
                }
            });
            loginDialog.show(getSupportFragmentManager(), "登录");
        }
        return super.onOptionsItemSelected(item);
    }
}