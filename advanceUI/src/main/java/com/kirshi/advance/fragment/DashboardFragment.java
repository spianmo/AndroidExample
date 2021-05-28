package com.kirshi.advance.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.kirshi.advance.MainActivity;
import com.kirshi.advance.databinding.FragmentDashboardBinding;
import com.kirshi.framework.base.BaseFragment;


public class DashboardFragment extends BaseFragment<FragmentDashboardBinding> {

    @Override
    public void inCreateView() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getChildFragmentManager());
        v.viewPager.setAdapter(adapter);
        v.viewPager.setOffscreenPageLimit(adapter.getCount() - 1);
        v.tabs.setupWithViewPager(v.viewPager);
    }

    private static class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        public MyFragmentPagerAdapter(@NonNull FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return DashboradChildFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab " + position;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).setFabClickEvent(v -> {
            ((MainActivity) getActivity()).showSnackBar("DashboardFragment");
        });
    }
}