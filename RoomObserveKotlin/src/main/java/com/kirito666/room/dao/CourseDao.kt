package com.kirito666.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.kirito666.room.model.CourseModel

@Dao
interface CourseDao {
    @Insert
    fun insert(course: CourseModel)

    @Update
    fun update(course: CourseModel)

    @Delete
    fun delete(course: CourseModel)

    @get:Query("SELECT COUNT(*) from CourseModel")
    val itemsCount: LiveData<Int>

    @get:Query("SELECT * from CourseModel")
    val allCourse: LiveData<List<CourseModel>>
}