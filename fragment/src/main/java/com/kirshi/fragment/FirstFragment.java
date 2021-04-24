package com.kirshi.fragment;

import android.os.Bundle;

import com.kirshi.fragment.databinding.FragmentFirstBinding;

public class FirstFragment extends BaseFragment<FragmentFirstBinding> {

    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public FirstFragment() {

    }

    public static FirstFragment newInstance(String param1) {
        FirstFragment fragment = new FirstFragment();
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