package com.kirito666.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kirito666.room.pojo.CourseModel

@Dao
interface CourseDao {
    @Insert
    fun insert(course: CourseModel)

    @Update
    fun update(course: CourseModel)

    @get:Query("SELECT * from CourseModel")
    val allCourse: LiveData<List<CourseModel>>
}