package com.kirito666.room.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.slider.Slider
import com.kirito666.room.R
import com.kirito666.room.base.BaseActivity
import com.kirito666.room.databinding.ActivitySettingBinding
import com.kirito666.room.util.Prefs
import com.kirito666.room.util.SharedPreferenceBooleanLiveData
import com.kirito666.room.util.SharedPreferenceIntLiveData
import com.peanut.sdk.miuidialog.MIUIDialog

class SettingActivity : BaseActivity<ActivitySettingBinding>() {

    private val settingPreference = "Settings"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        v.schedulePaletteItem.setOnClickListener {
            v.switchIsShowSlider.isChecked = !v.switchIsShowSlider.isChecked
            Prefs.save("isShowSlider", v.switchIsShowSlider.isChecked)
        }

        v.scheduleIsNotCurWeek.setOnClickListener {
            v.switchIsNotCurWeek.isChecked = !v.switchIsNotCurWeek.isChecked
            Prefs.save("isNotCurWeek", v.switchIsNotCurWeek.isChecked)
        }
        v.scheduleCourseItemHeightItem.setOnClickListener {
            MIUIDialog(this).show {
                var slider: Slider? = null
                var titleTv: TextView? = null
                customView(R.layout.view_select_slider) { v ->
                    slider = v.findViewById(R.id.slider)
                    titleTv = v.findViewById(R.id.dialog_title)
                    titleTv?.text = "选择格子高度DP"
                    slider?.valueFrom = 1F
                    slider?.valueTo = 100F
                    slider?.value = Prefs.getInt("ItemHeight", 68).toFloat()
                }
                positiveButton(text = "确定") {
                    Prefs.save("ItemHeight", slider?.value?.toInt())
                    v.scheduleCourseItemHeightSubtitle.text =
                        slider?.value?.toInt().toString() + "dp"
                }
                negativeButton(text = "取消")
            }
        }
        v.scheduleCourseMarginItem.setOnClickListener {
            MIUIDialog(this).show {
                var slider: Slider? = null
                var titleTv: TextView? = null
                customView(R.layout.view_select_slider) { v ->
                    slider = v.findViewById(R.id.slider)
                    titleTv = v.findViewById(R.id.dialog_title)
                    titleTv?.text = "选择格子边距DP"
                    slider?.valueFrom = 1F
                    slider?.valueTo = 30F
                    slider?.value = Prefs.getInt("ItemMargin", 6).toFloat()
                }
                positiveButton(text = "确定") {
                    Prefs.save("ItemMargin", slider?.value?.toInt())
                    v.scheduleCourseMarginSubtitle.text = slider?.value?.toInt().toString() + "dp"
                }
                negativeButton(text = "取消")
            }
        }

        observeDataChanged()
    }

    @SuppressLint("SetTextI18n")
    fun observeDataChanged() {
        SharedPreferenceBooleanLiveData(
            getSharedPreferences(
                settingPreference,
                Context.MODE_PRIVATE
            ), "isShowSlider", false
        )
            .observe(this) { isShowSlider ->
                v.switchIsShowSlider.isChecked = isShowSlider
                v.showSliderSubTitle.text = if (isShowSlider) "当前显示网格线" else "当前不显示网格线"
            }

        SharedPreferenceBooleanLiveData(
            getSharedPreferences(
                settingPreference,
                Context.MODE_PRIVATE
            ), "isNotCurWeek", true
        )
            .observe(this) { isNotCurWeek ->
                v.switchIsNotCurWeek.isChecked = isNotCurWeek
                v.scheduleIsNotCurWeekSubTitle.text =
                    if (isNotCurWeek) "当前显示非本周课程" else "当前不显示非本周课程"
            }
        SharedPreferenceIntLiveData(
            getSharedPreferences(settingPreference, Context.MODE_PRIVATE),
            "ItemHeight",
            68
        )
            .observe(this) { itemHeight ->
                v.scheduleCourseItemHeightSubtitle.text = itemHeight.toString() + "dp"
            }
        SharedPreferenceIntLiveData(
            getSharedPreferences(settingPreference, Context.MODE_PRIVATE),
            "ItemMargin",
            6
        )
            .observe(this) { itemHeight ->
                v.scheduleCourseMarginSubtitle.text = itemHeight.toString() + "dp"
            }
    }
}