package com.kirshi.simple.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kirshi.advance.R;
import com.kirshi.advance.databinding.FragmentHomeBinding;
import com.kirshi.framework.base.BaseFragment;


public class HomeFragment extends BaseFragment<FragmentHomeBinding> {

    @Override
    public void inCreateView() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        v.tvHome.setText(R.string.do_not_stop_believing);
    }

}