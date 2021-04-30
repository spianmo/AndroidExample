package com.kirshi.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.kirshi.dialog.databinding.ActivityLoginBinding;

public class LoginDialog extends DialogFragment {
    private OnLoginCallback listener;
    private ActivityLoginBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ActivityLoginBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.btnLogin.setOnClickListener(v -> {
            String username = binding.edUsername.getText().toString();
            String password = binding.edPwd.getText().toString();
            listener.onCallback(username, password);
            LoginDialog.this.dismiss();
        });

        binding.btnCancel.setOnClickListener(v -> {
            listener.onCancel(LoginDialog.this);
            LoginDialog.this.dismiss();
        });
        return view;
    }

    public void setOnLoginInputListener(OnLoginCallback onLoginCallback) {
        this.listener = onLoginCallback;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    public interface OnLoginCallback {
        void onCallback(String username, String password);

        void onCancel(DialogFragment dialog);
    }

    @Override
    public void onStart() {
        WindowManager.LayoutParams params = requireDialog().getWindow().getAttributes();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        requireDialog().getWindow().setAttributes(params);
        super.onStart();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
