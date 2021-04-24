package com.kirshi.fragment;

import android.os.Bundle;

import com.kirshi.fragment.databinding.FragmentSecondBinding;

public class SecondFragment extends BaseFragment<FragmentSecondBinding> {

    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public SecondFragment() {

    }

    public static SecondFragment newInstance(String param1) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

}