package com.kirito666.room.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class CourseModel(
    //学生 id
    var uid: String? = null,
    //课程 id
    @PrimaryKey(autoGenerate = true)
    var cid: Long? = null,
    //课程名
    var cname: String = "",
    //学年
    var schoolYear: String? = null,
    //学期
    var term: String? = null,
    //学分
    var credit: Float = 0f,
    //开始节次
    var startSection: Int = 1,
    //结束节次
    var endSection: Int = 1,
    //开始周次
    var startWeek: Int = 0,
    //结束周次
    var endWeek: Int = 0,
    //周几
    var dayOfWeek: Int = 0,
    //教室
    var classroom: String? = null,
    //教师
    var teacher: String? = null
) : Serializable