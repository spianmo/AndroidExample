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
import com.kirito666.room.R
import com.kirito666.room.base.BaseActivity
import com.kirito666.room.databinding.ActivityCourseBinding
import com.kirito666.room.db.AppDatabase
import com.kirito666.room.model.CourseModel
import com.kirito666.room.util.DateUtil
import kotlinx.coroutines.*

class CourseActivity : BaseActivity<ActivityCourseBinding>() {
    private val errorHandler = CoroutineExceptionHandler { _, throwable ->
        ktxRunOnUi { throwable.toast(this) }
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val currentWeek = 13
        v.tvCurrentMouth.text = DateUtil.getMonthInEng() + DateUtil.getDate("dd")
        v.tvCurrentWeek.text = currentWeek.toString() + "周"
        v.courseview.setCurrentWeek(currentWeek)
        v.courseview.showAbsent(true)
        v.courseview.setCourseItemMargin(6)
        v.courseview.showDivider(false)
        v.courseview.setOnCourseItemClickListener { view, course ->
            run {
                showMenu(view, course)
            }
        }

        v.fabAdd.setOnClickListener {
            startActivity(Intent(this, AddCourseActivity().javaClass))
        }

        v.btnProfile.setOnClickListener {

        }
        v.btnSetting.setOnClickListener {
            loadTestData().forEach {
                GlobalScope.launch(errorHandler) {
                    withContext(Dispatchers.IO) {
                        AppDatabase.getInstance(applicationContext).courseDao().insert(it)
                    }
                }
            }
        }
        fetchCourseData()
    }

    private fun fetchCourseData() {
        AppDatabase.getInstance(applicationContext).courseDao().allCourse.observe(
            this, { courses ->
                v.courseview.loadCourses(courses)
            })
    }

    private fun loadTestData(): List<CourseModel> {
        val list: MutableList<CourseModel> = ArrayList()
        val course1 = CourseModel()
        course1.cname = "操作系统"
        course1.classroom = "教四513"
        course1.startSection = 1
        course1.endSection = 4
        course1.dayOfWeek = 1
        course1.startWeek = 3
        course1.endWeek = 13
        list.add(course1)
        val course2 = CourseModel()
        course2.cname = "Linux技术与应用"
        course2.classroom = "教四416"
        course2.startSection = 5
        course2.endSection = 8
        course2.dayOfWeek = 1
        course2.startWeek = 3
        course2.endWeek = 13
        list.add(course2)

        val course3 = CourseModel()
        course3.cname = "软件测试与质量保证"
        course3.classroom = "教四512"
        course3.startSection = 1
        course3.endSection = 2
        course3.dayOfWeek = 2
        course3.startWeek = 1
        course3.endWeek = 12
        list.add(course3)
        val course4 = CourseModel()
        course4.cname = "大学英语"
        course4.classroom = "教一203"
        course4.startSection = 3
        course4.endSection = 4
        course4.dayOfWeek = 2
        course4.startWeek = 1
        course4.endWeek = 12
        list.add(course4)
        val course5 = CourseModel()
        course5.cname = "Web应用开发"
        course5.classroom = "教四424"
        course5.startSection = 5
        course5.endSection = 8
        course5.dayOfWeek = 2
        course5.startWeek = 1
        course5.endWeek = 8
        list.add(course5)
        val course6 = CourseModel()
        course6.cname = "大学英语"
        course6.classroom = "教一203"
        course6.startSection = 1
        course6.endSection = 2
        course6.dayOfWeek = 3
        course6.startWeek = 1
        course6.endWeek = 12
        list.add(course6)
        val course6_ = CourseModel()
        course6_.cname = "移动应用开发"
        course6_.classroom = "教四512"
        course6_.startSection = 1
        course6_.endSection = 4
        course6_.dayOfWeek = 3
        course6_.startWeek = 13
        course6_.endWeek = 15
        list.add(course6_)
        val course7 = CourseModel()
        course7.cname = "马克思主义"
        course7.classroom = "教一210"
        course7.startSection = 5
        course7.endSection = 6
        course7.dayOfWeek = 4
        course7.startWeek = 1
        course7.endWeek = 16
        list.add(course7)
        val course8 = CourseModel()
        course8.cname = "软件工程"
        course8.classroom = "教四416"
        course8.startSection = 9
        course8.endSection = 10
        course8.dayOfWeek = 4
        course8.startWeek = 1
        course8.endWeek = 17
        list.add(course8)
        val course9 = CourseModel()
        course9.cname = "软件测试"
        course9.classroom = "教四512"
        course9.startSection = 1
        course9.endSection = 2
        course9.dayOfWeek = 5
        course9.startWeek = 1
        course9.endWeek = 12
        list.add(course9)
        val course10 = CourseModel()
        course10.cname = "移动应用开发"
        course10.classroom = "教四512"
        course10.startSection = 3
        course10.endSection = 6
        course10.dayOfWeek = 5
        course10.startWeek = 1
        course10.endWeek = 15
        list.add(course10)
        return list
    }

    @SuppressLint("RestrictedApi")
    private fun showMenu(view: View, course: CourseModel) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.popup_menu)
        popup.setOnMenuItemClickListener { item: MenuItem? ->
            when (item!!.itemId) {
                R.id.it_viewCourse -> course.toast(baseContext)
                R.id.it_editCourse -> startActivity(
                    Intent(
                        this,
                        AddCourseActivity().javaClass
                    ).putExtra("course", course)
                )
                R.id.it_deleteCourse ->
                    GlobalScope.launch(errorHandler) {
                        withContext(Dispatchers.IO) {
                            AppDatabase.getInstance(applicationContext).courseDao().delete(course)
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