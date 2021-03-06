package com.kirito.androidexample.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.viewpager.widget.ViewPager;

/**
 * Copyright (c) 2021
 *
 * @Project:Freya
 * @Author:Finger
 * @FileName:DynicViewPager.java
 * @LastModified:2021-03-28T00:38:02.904+08:00
 */

public class DynicViewPager extends ViewPager {

    public DynicViewPager(Context context) {
        super(context);
    }

    public DynicViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        if (Math.abs(dx) > 50) {
            return super.canScroll(v, checkV, dx, x, y);
        } else {
            return true;
        }

    }
}
