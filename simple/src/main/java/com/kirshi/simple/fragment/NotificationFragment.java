package com.kirshi.simple.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kirshi.advance.R;
import com.kirshi.advance.databinding.FragmentNotificationBinding;
import com.kirshi.framework.base.BaseFragment;


public class NotificationFragment extends BaseFragment<FragmentNotificationBinding> {

    @Override
    public void inCreateView() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        v.tvNotification.setText(R.string.life_is_a_very_funny_proposition_after_all);
    }

}