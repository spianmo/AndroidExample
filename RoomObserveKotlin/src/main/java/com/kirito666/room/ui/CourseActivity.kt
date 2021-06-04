package com.kirito666.room.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.InsetDrawable
import android.os.Bundle
import android.util.TypedValue
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.menu.MenuBuilder
import androidx.appcompat.widget.PopupMenu
import com.kirito666.room.App
import com.kirito666.room.R
import com.kirito666.room.base.BaseActivity
import com.kirito666.room.databinding.ActivityCourseBinding
import com.kirito666.room.db.AppDatabase
import com.kirito666.room.model.CourseModel
import com.kirito666.room.original.CourseDao
import com.kirito666.room.test.TestData
import com.kirito666.room.util.DateUtil
import com.kirito666.room.util.Prefs
import com.kirito666.room.util.SharedPreferenceBooleanLiveData
import com.kirito666.room.util.SharedPreferenceIntLiveData
import com.peanut.sdk.miuidialog.MIUIDialog
import kotlinx.coroutines.*

class CourseActivity : BaseActivity<ActivityCourseBinding>() {
    private val errorHandler = CoroutineExceptionHandler { _, throwable ->
        ktxRunOnUi { throwable.toast(this) }
    }
    private val settingPreference = "Settings"
    private val oncePreferenceKey = "Once"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!Prefs.getBoolean(oncePreferenceKey, false)) {
            TestData.loadCourses().forEach {
                GlobalScope.launch(errorHandler) {
                    withContext(Dispatchers.IO) {
                        AppDatabase.getInstance(applicationContext).courseDao().insert(it)
                    }
                }
            }
            Prefs.save(oncePreferenceKey, true)
        }

        val currentWeek = 13
        v.tvCurrentMouth.text = DateUtil.getMonthInEng() + DateUtil.getDate("dd")
        v.tvCurrentWeek.text = currentWeek.toString() + "周"
        v.courseview.setCurrentWeek(currentWeek)

        v.courseview.setOnCourseItemClickListener { view, course ->
            run {
                showMenu(view, course)
            }
        }

        v.fabAdd.setOnClickListener {
            startActivity(Intent(this, AddCourseActivity().javaClass))
        }

        v.btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity().javaClass))
        }
        v.btnSetting.setOnClickListener {
            startActivity(Intent(this, SettingActivity::class.java))
        }
        observeCourseData()
        observeConfigChanged()
    }

    private val mCourseDao = CourseDao(App.context)
    private var isUseRoom = true

    override fun onResume() {
        super.onResume()
        if (!isUseRoom) v.courseview.loadCourses(mCourseDao.selectAll())
    }

    private fun observeCourseData() {
        AppDatabase.getInstance(applicationContext).courseDao().allCourse.observe(
            this, { courses ->
                if (isUseRoom) v.courseview.loadCourses(courses)
            })
    }

    @SuppressLint("SetTextI18n")
    fun observeConfigChanged() {
        SharedPreferenceBooleanLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "isShowSlider",
            false
        )
            .observe(this) { isShowSlider ->
                v.courseview.showDivider(isShowSlider)
            }

        SharedPreferenceBooleanLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "isNotCurWeek",
            true
        )
            .observe(this) { isNotCurWeek ->
                v.courseview.showAbsent(isNotCurWeek)
            }
        SharedPreferenceIntLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "ItemHeight",
            68
        )
            .observe(this) { itemHeight ->
                v.courseview.setCourseItemHeight(itemHeight)
            }
        SharedPreferenceIntLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "ItemMargin",
            6
        )
            .observe(this) { itemMargin ->
                v.courseview.setCourseItemMargin(itemMargin)
            }
        SharedPreferenceBooleanLiveData(
            getSharedPreferences(settingPreference, MODE_PRIVATE),
            "useRoom",
            true
        )
            .observe(this) { useRoom ->
                isUseRoom = useRoom
            }
    }

    @SuppressLint("RestrictedApi")
    private fun showMenu(view: View, course: CourseModel) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.popup_menu)
        popup.setOnMenuItemClickListener { item: MenuItem? ->
            when (item!!.itemId) {
                R.id.it_viewCourse -> MIUIDialog(this).show {
                    title(text = "课程详情")
                    message(text = course.toString())
                }
                R.id.it_editCourse -> startActivity(
                    Intent(
                        this,
                        AddCourseActivity().javaClass
                    ).putExtra("course", course)
                )
                R.id.it_deleteCourse ->
                    GlobalScope.launch(errorHandler) {
                        withContext(Dispatchers.IO) {
                            if (isUseRoom)
                                AppDatabase.getInstance(applicationContext).courseDao()
                                    .delete(course)
                            else
                                mCourseDao.delete(course)
                        }
                    }
            }
            true
        }
        if (popup.menu is MenuBuilder) {
            val menuBuilder = popup.menu as MenuBuilder
            menuBuilder.setOptionalIconsVisible(true)
            for (item in menuBuilder.visibleItems) {
                val iconMarginPx =
                    TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP, 0F, resources.displayMetrics
                    )
                        .toInt()
                if (item.icon != null) {
                    item.icon = InsetDrawable(item.icon, iconMarginPx, 0, iconMarginPx, 0)
                }
            }
        }
        popup.show()
    }
}