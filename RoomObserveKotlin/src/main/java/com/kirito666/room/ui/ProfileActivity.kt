package com.kirito666.room.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.kirito666.room.base.BaseActivity
import com.kirito666.room.databinding.ActivityProfileBinding
import com.kirito666.room.util.Prefs
import com.kirito666.room.util.SharedPreferenceStringLiveData
import com.peanut.sdk.miuidialog.MIUIDialog


class ProfileActivity : BaseActivity<ActivityProfileBinding>() {
    private val settingPreference = "Settings"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val window: Window = window
        val decorView: View = window.decorView
        val option: Int = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
        decorView.systemUiVisibility = option
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT

        setSupportActionBar(v.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        v.toolbar.setNavigationOnClickListener { finish() }
        v.profileTelephone.setOnClickListener {
            showEditDialog("请输入电话号码", "profileTelephone")
        }
        v.profileUniversity.setOnClickListener {
            showEditDialog("请输入所属院校", "profileUniversity")
        }
        v.profileEmail.setOnClickListener {
            showEditDialog("请输入邮箱", "profileEmail")
        }
        v.profileClass.setOnClickListener {
            showEditDialog("请输入所属行政班级", "profileClass")
        }
        observeSharedPreferencesChanged()
    }

    private fun showEditDialog(title: String, key: String) {
        MIUIDialog(this).show {
            input(
                prefill = Prefs.getString(key),
                hint = title
            ) { it, _ ->
                Prefs.save(key, it.toString())
            }
            positiveButton(text = "保存") { }
            negativeButton(text = "取消") { }
        }
    }

    private fun observeSharedPreferencesChanged() {
        SharedPreferenceStringLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "profileTelephone",
            "+86-13861948872"
        )
            .observe(this) { value ->
                v.profileTelephoneSubtitle.text = value
            }

        SharedPreferenceStringLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "profileUniversity",
            "南京工业职业技术大学"
        )
            .observe(this) { value ->
                v.profileUniversitySubtitle.text = value
            }
        SharedPreferenceStringLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "profileEmail",
            "Finger@spianmo.com"
        )
            .observe(this) { value ->
                v.profileEmailSubtitle.text = value
            }
        SharedPreferenceStringLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "profileClass",
            "计算机与软件学院-软件2036"
        )
            .observe(this) { value ->
                v.profileClassSubtitle.text = value
            }
    }
}