package com.kirito666.room.component

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.TextView
import com.kirito666.room.R
import com.kirito666.room.model.CourseModel
import com.kirito666.room.util.DateUtil
import java.util.*


/**
 * @author Finger
 */
class CourseView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(
    context, attrs, defStyleAttr
) {
    private var mCaldender: Calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"))
    private val mList: MutableList<CourseModel>
    private val screenWidth: Int
    private val screenHeight: Int
    private val gridItemWidth: Int
    private val gridItemHeight: Int
    private val titleHeight: Int
    private val sectionWidth: Int
    private val mDividerPaint: Paint
    private val mTitlePaint: Paint
    private val dayOfWeek = arrayOf("一", "二", "三", "四", "五", "六", "日")
    private val courseColors = arrayOfNulls<String>(30)
    private var CourseColorArrIndex = 0
    private var currentWeek: Int
    private var showAbsentCourse: Boolean = false
    private var itemMargin: Int = 1
    private var showDivider: Boolean = false


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(screenWidth, screenHeight)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {}
    private fun drawViews(list: List<CourseModel>) {
        val allDays = getOneDayCourses(list)
        for (i in 1..MAX_DAY) {
            drawOneDayCourse(i, allDays[i])
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        drawVerticalDivider(canvas)
        drawHorizontalDivider(canvas)
    }

    /**
     * 画一天的课程,首先需要将一天的课程按照开始节次排序,然后从上到下依次画
     */
    private fun drawOneDayCourse(day: Int, courses: List<CourseModel>?) {
        if (courses == null) {
            return
        }

        //将一天的课程排序
        Collections.sort(courses) { lhs, rhs -> lhs.startSection - rhs.startSection }
        for (i in courses.indices) {
            val course = courses[i]

            //如果索引为 0 ,显示全部课程,否则显示指定周的课程
            if (currentWeek != 0 && (course.startWeek > currentWeek || course.endWeek < currentWeek) && !showAbsentCourse) {
                continue
            }
            val tvItem = TextView(context)
            tvItem.setTextColor(-0x1)
            tvItem.layout(
                gridItemWidth * (day - 1) + sectionWidth + 1 + itemMargin,
                gridItemHeight * (course.startSection - 1) + titleHeight + 1 + itemMargin,
                gridItemWidth * day + sectionWidth - itemMargin,
                gridItemHeight * course.endSection + titleHeight - itemMargin
            )

            tvItem.textSize = 12f
            tvItem.gravity = Gravity.CENTER
            if (course.startWeek > currentWeek || course.endWeek < currentWeek) {
                tvItem.text =
                    StringBuilder().append(course.cname).append("@").append(course.classroom)
                        .append("\n(非本周)")
                tvItem.setBackgroundResource(R.drawable.select_course_item_grey)
            } else {
                tvItem.text =
                    StringBuilder().append(course.cname).append("@").append(course.classroom)
                tvItem.setBackgroundResource(Colors[getColorIndex(course.cname)])
            }
            tvItem.textSize = 13f
            tvItem.setOnClickListener {
                if (::onCourseItemClickListener.isInitialized)
                    onCourseItemClickListener.invoke(it, course)

            }
            addView(tvItem)
        }
    }

    fun loadCourses(list: List<CourseModel>?) {
        removeAllViews()
        mList.clear()
        mList.addAll(list!!)
        drawViews(mList)
        invalidate()
    }

    fun clear() {
        removeAllViews()
        mList.clear()
        invalidate()
    }

    fun setCourseItemMargin(itemMargin: Int) {
        this.itemMargin = itemMargin
        removeAllViews()
        drawViews(mList)
        invalidate()
    }

    fun setCurrentWeek(currentWeek: Int) {
        this.currentWeek = currentWeek
        removeAllViews()
        drawViews(mList)
        invalidate()
    }

    fun showAbsent(isShow: Boolean) {
        this.showAbsentCourse = isShow
        removeAllViews()
        drawViews(mList)
        invalidate()
    }

    fun showDivider(isShow: Boolean) {
        this.showDivider = isShow
        removeAllViews()
        drawViews(mList)
        invalidate()
    }

    private fun getOneDayCourses(list: List<CourseModel>): Map<Int, MutableList<CourseModel>> {
        val allDays: MutableMap<Int, MutableList<CourseModel>> = HashMap()
        for (i in list.indices) {
            matchCourseName(list[i].cname)
            if (allDays.containsKey(list[i].dayOfWeek)) {
                allDays[list[i].dayOfWeek]!!.add(list[i])
            } else {
                val oneDayList: MutableList<CourseModel> = ArrayList()
                oneDayList.add(list[i])
                allDays[list[i].dayOfWeek] = oneDayList
            }
        }
        return allDays
    }

    /**
     * 画竖直方向的分割线和周几
     */
    private fun drawVerticalDivider(canvas: Canvas) {
        for (i in 0..MAX_DAY) {
            if (i == 0) {
                if (showDivider) {
                    canvas.drawLine(
                        sectionWidth.toFloat(),
                        0f,
                        sectionWidth.toFloat(),
                        screenHeight.toFloat(),
                        mDividerPaint
                    )
                }
            } else {
                if (showDivider) {
                    canvas.drawLine(
                        (i * gridItemWidth + sectionWidth).toFloat(),
                        0f,
                        (i * gridItemWidth + sectionWidth).toFloat(),
                        screenHeight.toFloat(),
                        mDividerPaint
                    )
                }

                // 后一天为 +1   前一天 为-1
                val day = dayOfWeek[i - 1] + DateUtil.getDateBeforeOfAfter(
                    mCaldender.time,
                    i - currentDayOfWeek()
                )

                // 画文字
                val fontMetrics = mTitlePaint.fontMetrics
                val textWidth = mTitlePaint.measureText(day)

                val cx = ((i - 1) * gridItemWidth + sectionWidth + gridItemWidth / 2).toFloat()
                val cy = titleHeight.toFloat() / 2
                if (i == currentDayOfWeek()) { //对今天高亮显示
                    mTitlePaint.color = -0x1
                    val rectF = RectF(
                        ((i - 1) * gridItemWidth + sectionWidth).toFloat(),
                        0F,
                        (i * gridItemWidth + sectionWidth).toFloat(),
                        titleHeight.toFloat()
                    )
                    mDividerPaint.color = 0xffcdd4fe.toInt()
                    canvas.drawRoundRect(rectF, 12F, 12F, mDividerPaint)
                } else {
                    mTitlePaint.color = -0xbbbbbc
                }
                canvas.drawText(
                    day,
                    cx - textWidth / 2,
                    cy + (fontMetrics.bottom - fontMetrics.top) / 2 - fontMetrics.bottom,
                    mTitlePaint
                )
            }
        }
    }

    /**
     * 画水平方向的分割线和节次
     */
    private fun drawHorizontalDivider(canvas: Canvas) {
        for (j in 0..MAX_SECTION) {
            if (j == 0) {
                if (showDivider) {
                    canvas.drawLine(
                        0f,
                        titleHeight.toFloat(),
                        screenWidth.toFloat(),
                        titleHeight.toFloat(),
                        mDividerPaint
                    )
                }
            } else {
                if (showDivider) {
                    canvas.drawLine(
                        0f,
                        (j * gridItemHeight + titleHeight).toFloat(),
                        screenWidth.toFloat(),
                        (j * gridItemHeight + titleHeight).toFloat(),
                        mDividerPaint
                    )
                }
                val fontMetrics = mTitlePaint.fontMetrics
                //画文字
                val section = j.toString()
                val textWidth = mTitlePaint.measureText(section)
                val cx = sectionWidth.toFloat() / 2
                val cy = ((j - 1) * gridItemHeight + titleHeight + gridItemHeight / 2).toFloat()
                mTitlePaint.color = -0xbbbbbc
                canvas.drawText(
                    section,
                    cx - textWidth / 2,
                    cy + (fontMetrics.bottom - fontMetrics.top) / 2 - fontMetrics.bottom,
                    mTitlePaint
                )
            }
        }
    }

    /**
     * 获取屏幕宽度
     */
    private fun getScreenWidth(): Int {
        val dm = DisplayMetrics()
        (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay.getMetrics(
            dm
        )
        return dm.widthPixels
    }

    /**
     * 获取屏幕高度
     */
    private fun getScreenHeight(): Int {
        val dm = DisplayMetrics()
        (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay.getMetrics(
            dm
        )
        return dm.heightPixels - statusBarHeight
    }

    private val statusBarHeight: Int
        get() {
            var result = 0
            val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = resources.getDimensionPixelSize(resourceId)
            }
            return result
        }

    private fun dp2px(dpValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    /**
     * 将课程名装入颜色数组,每一个课程对应一种颜色,相同课程颜色相同
     */
    private fun matchCourseName(courseName: String?) {
        var isRepeat = true
        for (i in 0..29) {
            if (courseName == courseColors[i]) {
                isRepeat = true
                break
            } else {
                isRepeat = false
            }
        }
        if (!isRepeat) {
            courseColors[CourseColorArrIndex] = courseName
            CourseColorArrIndex++
        }
    }

    /**
     * 当前是一周中的第几天
     */
    fun currentDayOfWeek(): Int {
        val cal = Calendar.getInstance()
        val day = cal[Calendar.DAY_OF_WEEK]

        //Java中的Calendar,一周的第一天是星期日,这里做一个转换
        val days = intArrayOf(7, 1, 2, 3, 4, 5, 6)
        return days[day - 1]
    }

    /**
     * 获取数组中的课程对应的索引
     */
    fun getColorIndex(courseName: String?): Int {
        var index = 0
        for (i in 0..19) {
            if (courseName == courseColors[i]) {
                index = i
            }
        }
        return index
    }

    fun setOnCourseItemClickListener(onCourseItemClickListener: (view: View, course: CourseModel) -> Unit) {
        this.onCourseItemClickListener = onCourseItemClickListener
    }

    private lateinit var onCourseItemClickListener: (view: View, course: CourseModel) -> Unit

    companion object {
        private const val MAX_DAY = 7
        private const val MAX_SECTION = 12
        val Colors = intArrayOf(
            R.drawable.select_course_item_blue,
            R.drawable.select_course_item_green, R.drawable.select_course_item_red,
            R.drawable.select_course_item_cyan, R.drawable.select_course_item_pink,
            R.drawable.select_course_item_purple, R.drawable.select_course_item_orange,
            R.drawable.select_course_item_deep_orange, R.drawable.select_course_item_deep_purple,
            R.drawable.select_course_item_light_blue, R.drawable.select_course_item_light_green,
            R.drawable.select_course_item_indigo, R.drawable.select_course_item_teal,
            R.drawable.select_course_item_deep_orange, R.drawable.select_course_item_deep_purple,
            R.drawable.select_course_item_light_blue, R.drawable.select_course_item_light_green,
            R.drawable.select_course_item_indigo, R.drawable.select_course_item_teal,
            R.drawable.select_course_item_indigo, R.drawable.select_course_item_teal,
            R.drawable.select_course_item_deep_orange, R.drawable.select_course_item_deep_purple,
            R.drawable.select_course_item_light_blue, R.drawable.select_course_item_light_green,
            R.drawable.select_course_item_indigo, R.drawable.select_course_item_teal
        )
    }

    init {
        mList = ArrayList()
        mDividerPaint = Paint()
        mDividerPaint.color = -0x424243
        mTitlePaint = Paint()
        mTitlePaint.isAntiAlias = true
        mTitlePaint.textSize = 32f
        mTitlePaint.color = -0xbbbbbc
        screenWidth = getScreenWidth()
        sectionWidth = dp2px(26f)
        titleHeight = dp2px(30f)
        gridItemWidth = (screenWidth - sectionWidth) / MAX_DAY + 1
        gridItemHeight = dp2px(68f)
        screenHeight = gridItemHeight * 12 + 100

        //在 ViewGroup 中,如果不设置这个属性为 false,默认是不会调用 onDraw 方法的
        setWillNotDraw(false)
        currentWeek = 0 //默认显示全部课程
    }
}