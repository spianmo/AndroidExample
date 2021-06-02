package com.kirito666.room.base;

import java.lang.System;

/**
 * Copyright (c) 2021
 *
 * @Project:Freya
 * @Author:Finger
 * @FileName:BaseActivity.java
 * @LastModified:2021-04-15T03:12:15.850+08:00
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0004J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u001e\u0010\u0016\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/kirito666/room/base/BaseActivity;", "V", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "handler", "Landroid/os/Handler;", "mContext", "Landroid/app/Activity;", "v", "getV", "()Landroidx/viewbinding/ViewBinding;", "setV", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "ktxRunOnUi", "", "block", "Lkotlin/Function0;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "toast", "", "context", "Landroid/content/Context;", "duration", "", "RoomObserveKotlin_debug"})
public class BaseActivity<V extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    private final android.os.Handler handler = null;
    protected V v;
    private android.app.Activity mContext;
    
    public BaseActivity() {
        super();
    }
    
    protected final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.Object $this$toast, @org.jetbrains.annotations.NotNull()
    android.content.Context context, int duration) {
    }
    
    protected final void ktxRunOnUi(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final V getV() {
        return null;
    }
    
    protected final void setV(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}