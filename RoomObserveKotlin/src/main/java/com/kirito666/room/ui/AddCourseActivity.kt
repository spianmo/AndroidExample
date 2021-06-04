package com.kirito666.room.ui

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.slider.RangeSlider
import com.kirito666.room.App
import com.kirito666.room.R
import com.kirito666.room.base.BaseActivity
import com.kirito666.room.component.SelectWeeksDialog
import com.kirito666.room.databinding.ActivityAddCourseBinding
import com.kirito666.room.db.AppDatabase
import com.kirito666.room.model.CourseModel
import com.kirito666.room.original.CourseDao
import com.kirito666.room.util.DateUtil
import com.kirito666.room.util.Prefs
import com.peanut.sdk.miuidialog.MIUIDialog
import kotlinx.coroutines.*

class AddCourseActivity : BaseActivity<ActivityAddCourseBinding>() {

    private val errorHandler = CoroutineExceptionHandler { _, throwable ->
        ktxRunOnUi { throwable.toast(this) }
    }
    var mCourse: CourseModel = CourseModel()
    private var hasCourseData = false
    private val mCourseDao = CourseDao(App.context)

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.hasExtra("course")) {
            mCourse = intent.getSerializableExtra("course") as CourseModel
            v.addCoursePageTitle.text = "修改课程"
            v.versionSlogan.text = "在本页面修改已保存的课程记录"
            v.addCourse.text = "保存修改"
            hasCourseData = true
        }
        if (mCourse.cname.isNotEmpty()) {
            v.courseNameSubTitle.text = mCourse.cname
        }

        if (mCourse.teacher != null) {
            v.courseTeacherSubtitle.text = mCourse.teacher
        }

        if (mCourse.classroom != null) {
            v.coursePositionSubtitle.text = mCourse.cname
        }

        if (mCourse.startWeek != 0 && mCourse.endWeek != 0) {
            v.courseWeekSubTitle.text = "上课周：" + mCourse.startWeek + " - " + mCourse.endWeek
        }

        if (mCourse.dayOfWeek != 0) {
            v.editCourseDaySubtitle.text = "星期" + DateUtil.getWeekInChi(mCourse.dayOfWeek)
        }

        v.s3SubTitle.text = "上课节次：" + mCourse.startSection + " - " + mCourse.endSection + "节"

        v.editCourseName.setOnClickListener {
            MIUIDialog(this).show {
                title(text = "编辑课程名称")
                input(
                    prefill = if (mCourse.cname.isNotEmpty()) mCourse.cname
                    else null, hint = "请输入课程名称"
                ) { it, _ ->
                    mCourse.cname = it.toString()
                    v.courseNameSubTitle.text = it
                }
                positiveButton(text = "保存")
                negativeButton(text = "取消")
            }
        }

        v.editCourseTeacher.setOnClickListener {
            MIUIDialog(this).show {
                title(text = "编辑课程教师")
                input(
                    prefill = if (mCourse.teacher != null) mCourse.teacher
                    else null, hint = "请输入课程教师"
                ) { it, _ ->
                    mCourse.teacher = it.toString()
                    v.courseTeacherSubtitle.text = it
                }
                positiveButton(text = "保存") { }
                negativeButton(text = "取消") { }
            }
        }
        if (mCourse.classroom?.isNotEmpty() == true) {
            v.coursePositionSubtitle.text = mCourse.classroom
        }
        v.editCoursePosition.setOnClickListener {
            MIUIDialog(this).show {
                title(text = "输入课程地点")
                input(
                    prefill = if (mCourse.classroom?.isNotEmpty() == true) mCourse.classroom
                    else null, hint = "请输入课程地点"
                ) { it, _ ->
                    mCourse.classroom = it.toString()
                    v.coursePositionSubtitle.text = it
                }
                positiveButton(text = "保存") { }
                negativeButton(text = "取消") { }
            }
        }

        v.editCourseWeek.setOnClickListener {
            SelectWeeksDialog().show(this, 24, listOf(mCourse.startWeek, mCourse.endWeek)) { res ->
                mCourse.startWeek = res[0]
                mCourse.endWeek = res[res.size - 1]
                v.courseWeekSubTitle.text = "上课周：" + mCourse.startWeek + " - " + mCourse.endWeek
            }
        }

        v.editCourseDay.setOnClickListener {
            MIUIDialog(this).show {
                customView(R.layout.view_select_day) { view ->
                    val chipGroup = view.findViewById<ChipGroup>(R.id.chipGroup)
                    val chipId = when (mCourse.dayOfWeek) {
                        1 -> R.id.week_1
                        2 -> R.id.week_2
                        3 -> R.id.week_3
                        4 -> R.id.week_4
                        5 -> R.id.week_5
                        6 -> R.id.week_6
                        7 -> R.id.week_7
                        else -> 0
                    }
                    if (chipId != 0) {
                        view.findViewById<Chip>(chipId).isChecked = true
                    }
                    chipGroup.setOnCheckedChangeListener { _, checkedId ->
                        val week = when (checkedId) {
                            R.id.week_2 -> 2
                            R.id.week_3 -> 3
                            R.id.week_4 -> 4
                            R.id.week_5 -> 5
                            R.id.week_6 -> 6
                            R.id.week_7 -> 7
                            else -> 1
                        }
                        mCourse.dayOfWeek = week
                        val dialog = this
                        view.postDelayed({
                            v.editCourseDaySubtitle.text = "星期" + DateUtil.getWeekInChi(week)
                            dialog.dismiss()
                        }, 700)
                    }
                }
            }
        }

        v.editCourseSession.setOnClickListener {
            MIUIDialog(this).show {
                var rangeSlider: RangeSlider? = null
                customView(R.layout.view_select_session) { v ->
                    rangeSlider = v.findViewById(R.id.rangeSlider)
                    rangeSlider?.valueFrom = 1F
                    rangeSlider?.valueTo = 12F
                    rangeSlider?.values =
                        mutableListOf(mCourse.startSection.toFloat(), mCourse.endSection.toFloat())
                }
                positiveButton(text = "确定") {
                    mCourse.startSection = (rangeSlider?.values?.get(0)
                        ?: 1F).toInt()
                    mCourse.endSection = (rangeSlider?.values?.get(1)
                        ?: 1F).toInt()
                    v.s3SubTitle.text =
                        "上课节次：" + mCourse.startSection + " - " + mCourse.endSection + "节"
                }
                negativeButton(text = "取消")
            }
        }

        v.addCourse.setOnClickListener {
            if (mCourse.cname.isEmpty() || mCourse.dayOfWeek == 0 || mCourse.startWeek == 0
                || mCourse.endWeek == 0 || mCourse.startSection == 0 || mCourse.endSection == 0
            ) {
                MIUIDialog(this).show {
                    title(text = "数据校验")
                    message(text = "关键字段不能为空")
                    positiveButton(text = "确定") { }
                }
            } else {
                GlobalScope.launch(errorHandler) {
                    withContext(Dispatchers.IO) {
                        if (Prefs.getBoolean("useRoom", true)) {
                            if (hasCourseData) {
                                AppDatabase.getInstance(applicationContext)
                                    .courseDao()
                                    .update(mCourse)
                            } else {
                                AppDatabase.getInstance(applicationContext)
                                    .courseDao()
                                    .insert(mCourse)
                            }
                        } else {
                            if (hasCourseData) mCourseDao.update(mCourse) else mCourseDao.insert(
                                mCourse
                            )
                        }
                    }
                }
                try {
                    MIUIDialog(this).show {
                        message(text = "数据处理成功")
                        positiveButton(text = "确定") {
                            finish()
                        }
                    }
                } catch (ignored: Exception) {
                }
            }
        }
    }
}