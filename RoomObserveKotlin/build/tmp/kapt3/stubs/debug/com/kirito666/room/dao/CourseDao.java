package com.kirito666.room.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\'R \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/kirito666/room/dao/CourseDao;", "", "allCourse", "Landroidx/lifecycle/LiveData;", "", "Lcom/kirito666/room/model/CourseModel;", "getAllCourse", "()Landroidx/lifecycle/LiveData;", "itemsCount", "", "getItemsCount", "delete", "", "course", "insert", "update", "RoomObserveKotlin_debug"})
public abstract interface CourseDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.kirito666.room.model.CourseModel course);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.kirito666.room.model.CourseModel course);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.kirito666.room.model.CourseModel course);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) from CourseModel")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getItemsCount();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from CourseModel")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.kirito666.room.model.CourseModel>> getAllCourse();
}