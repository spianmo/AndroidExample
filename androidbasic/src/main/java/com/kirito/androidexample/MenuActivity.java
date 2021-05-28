package com.kirito.androidexample;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.kirito.androidexample.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        registerForContextMenu(binding.edExample);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_action, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_copy:
                tmpStr = binding.edExample.getText().toString();
                return true;
            case R.id.action_parse:
                binding.edExample.setText(binding.edExample.getText().toString() + tmpStr);
                return true;
            case R.id.action_clear:
                binding.edExample.setText("");
                return true;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action, menu);
        return true;
    }

    String tmpStr;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_copy:
                tmpStr = binding.edExample.getText().toString();
                return true;
            case R.id.action_parse:
                binding.edExample.setText(binding.edExample.getText().toString() + tmpStr);
                return true;
            case R.id.action_clear:
                binding.edExample.setText("");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}