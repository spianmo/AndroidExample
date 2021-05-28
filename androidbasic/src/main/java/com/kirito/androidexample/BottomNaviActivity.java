package com.kirito.androidexample;

import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kirito.androidexample.databinding.ActivityBottombarBinding;
import com.kirito.androidexample.fragment.ChatListFragment;
import com.kirito.androidexample.fragment.ContactListFragment;
import com.kirito.androidexample.fragment.NewsFragment;
import com.kirito.androidexample.fragment.ProfileFragment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BottomNaviActivity extends AppCompatActivity {
    private ActivityBottombarBinding v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v = ActivityBottombarBinding.inflate(getLayoutInflater());
        setContentView(v.getRoot());
        setSupportActionBar(v.mainToolbar);
        v.container.bottomNavigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.action_msg:
                    v.container.viewPager.setCurrentItem(0, true);
                    return true;
                case R.id.action_contact:
                    v.container.viewPager.setCurrentItem(1, true);
                    return true;
                case R.id.action_news:
                    v.container.viewPager.setCurrentItem(2, true);
                    return true;
                case R.id.action_profile:
                    v.container.viewPager.setCurrentItem(3, true);
                    return true;
            }
            return false;
        });

        v.container.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                v.container.bottomNavigation.getMenu().getItem(i).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new ChatListFragment());
        fragmentList.add(new ContactListFragment());
        fragmentList.add(new NewsFragment());
        fragmentList.add(new ProfileFragment());


        FragmentManager fragmentManager = getSupportFragmentManager();
        v.container.viewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
            @NotNull
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @NotNull
            @Override
            public Object instantiateItem(@NotNull ViewGroup container, int position) {
                Fragment fragment = (Fragment) super.instantiateItem(container, position);
                getSupportFragmentManager().beginTransaction().show(fragment).commitAllowingStateLoss();
                return fragment;
            }

            @Override
            public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
                Fragment fragment = fragmentList.get(position);
                getSupportFragmentManager().beginTransaction().hide(fragment).commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_extra, menu);
        return true;
    }

}