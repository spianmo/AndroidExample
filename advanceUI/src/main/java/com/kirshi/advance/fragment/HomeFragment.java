package com.kirshi.advance.fragment;

import androidx.annotation.NonNull;

import com.google.android.material.slider.Slider;
import com.kirshi.advance.databinding.FragmentHomeBinding;
import com.kirshi.advance.utils.DensityUtil;
import com.kirshi.framework.base.BaseFragment;

import org.jetbrains.annotations.NotNull;


/**
 * @author Finger
 */
public class HomeFragment extends BaseFragment<FragmentHomeBinding> {

    @Override
    public void inCreateView() {
        v.sliderElevation.setLabelFormatter(value -> value + "dp");
        v.sliderRadius.setLabelFormatter(value -> value + "dp");
        v.sliderMargin.setLabelFormatter(value -> value + "px");
        v.sliderElevation.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull @NotNull Slider slider, float value, boolean fromUser) {
                v.card.setElevation(DensityUtil.dip2px(mContext, value));
            }
        });

        v.sliderRadius.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull @NotNull Slider slider, float value, boolean fromUser) {
                v.card.setRadius(DensityUtil.dip2px(mContext, value));
            }
        });

        v.sliderMargin.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull @NotNull Slider slider, float value, boolean fromUser) {
                v.card.setContentPadding((int) value, (int) value, (int) value, (int) value);
            }
        });
    }

}