package com.kirshi.dialog;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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