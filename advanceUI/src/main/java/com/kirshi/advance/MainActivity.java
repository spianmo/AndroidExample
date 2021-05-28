package com.kirshi.advance;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.kirshi.advance.databinding.ActivityMainBinding;
import com.kirshi.advance.fragment.DashboardFragment;
import com.kirshi.advance.fragment.HomeFragment;
import com.kirshi.advance.fragment.NotificationFragment;
import com.kirshi.framework.base.BaseActivity;

import java.lang.reflect.Method;

/**
 * @author Finger
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(v.toolbar);

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        v.viewPager.setAdapter(adapter);
        v.viewPager.setOffscreenPageLimit(adapter.getCount() - 1);
        v.navigation.setOnNavigationItemSelectedListener(item -> {
            v.toolbar.setSubtitle(item.getTitle());
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    v.viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    v.viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    v.viewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        });
        bindNavigationDrawer();
        getSupportActionBar().setSubtitle(v.navigation.getMenu().getItem(0).getTitle());
    }


    private void bindNavigationDrawer() {
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, v.drawerLayout, v.toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        v.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        v.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                v.navigation.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        v.navView.setNavigationItemSelectedListener(item -> {
            final int id = item.getItemId();
            switch (id) {
                case R.id.nav_home:
                    v.viewPager.setCurrentItem(0);
                    showSnackBar("nav_home");
                    break;
                case R.id.nav_dashboard:
                    v.viewPager.setCurrentItem(1);
                    showSnackBar("nav_dashboard");
                    break;
                case R.id.nav_notification:
                    v.viewPager.setCurrentItem(3);
                    showSnackBar("nav_notification");
                    break;
                case R.id.nav_share:
                    showSnackBar("nav_share");
                    break;
                case R.id.nav_setting:
                    showSnackBar("nav_setting");
                    break;
            }
            v.drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });

    }

    HomeFragment homeFragment;
    DashboardFragment dashboardFragment;
    NotificationFragment notificationFragment;

    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        public MyFragmentPagerAdapter(@NonNull FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    homeFragment = new HomeFragment();
                    return homeFragment;
                case 1:
                    dashboardFragment = new DashboardFragment();
                    return dashboardFragment;
                case 2:
                    notificationFragment = new NotificationFragment();
                    return notificationFragment;
            }
            return new HomeFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        setIconsVisible(menu, true);
        getMenuInflater().inflate(R.menu.menu_main_extra, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                new MaterialAlertDialogBuilder(mContext)
                        .setTitle("About")
                        .setIcon(R.drawable.ic_baseline_code_24)
                        .setMessage("Finger@spianmo.com")
                        .setNegativeButton("Cancel", (dialog, which) -> {

                        })
                        .setPositiveButton("OK", (dialog, which) -> {

                        })
                        .show();
                break;
        }
        return true;
    }

    private void setIconsVisible(Menu menu, boolean flag) {
        if (menu != null) {
            try {
                Method method = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(menu, flag);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public Snackbar showSnackBar(String message, View.OnClickListener onClickListener) {
        Snackbar snackbar = Snackbar.make(v.container, message, Snackbar.LENGTH_SHORT);
        snackbar.setAction("确定", onClickListener);
        runOnUI(snackbar::show);
        return snackbar;
    }

    @Override
    public Snackbar showSnackBar(String message) {
        Snackbar snackbar = Snackbar.make(v.container, message, Snackbar.LENGTH_SHORT);
        runOnUI(snackbar::show);
        return snackbar;
    }

    public void setFabClickEvent(View.OnClickListener onClickListener) {
        v.floatingActionButton.setOnClickListener(onClickListener);
    }
}