package com.kirito666.room.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/kirito666/room/ui/CourseActivity;", "Lcom/kirito666/room/base/BaseActivity;", "Lcom/kirito666/room/databinding/ActivityCourseBinding;", "()V", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "isUseRoom", "", "mCourseDao", "Lcom/kirito666/room/original/CourseDao;", "oncePreferenceKey", "", "settingPreference", "observeConfigChanged", "", "observeCourseData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showMenu", "view", "Landroid/view/View;", "course", "Lcom/kirito666/room/model/CourseModel;", "RoomObserveKotlin_debug"})
public final class CourseActivity extends com.kirito666.room.base.BaseActivity<com.kirito666.room.databinding.ActivityCourseBinding> {
    private final kotlinx.coroutines.CoroutineExceptionHandler errorHandler = null;
    private final java.lang.String settingPreference = "Settings";
    private final java.lang.String oncePreferenceKey = "Once";
    private final com.kirito666.room.original.CourseDao mCourseDao = null;
    private boolean isUseRoom = true;
    
    public CourseActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void observeCourseData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void observeConfigChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void showMenu(android.view.View view, com.kirito666.room.model.CourseModel course) {
    }
}