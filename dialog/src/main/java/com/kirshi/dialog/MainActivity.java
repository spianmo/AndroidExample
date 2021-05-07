package com.kirshi.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;

import com.kirshi.dialog.base.BaseActivity;
import com.kirshi.dialog.databinding.ActivityMainBinding;
import com.kirshi.dialog.dialog.CalculatorDialog;
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
            if (TextUtils.isEmpty(num1) || TextUtils.isEmpty(num2)) {
                showSnackBar("数字不能为空");
                return;
            }
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
        if (item.getItemId() == R.id.action_exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}