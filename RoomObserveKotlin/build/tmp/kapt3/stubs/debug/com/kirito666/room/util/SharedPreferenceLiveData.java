package com.kirito666.room.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u0013\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/kirito666/room/util/SharedPreferenceLiveData;", "T", "Landroidx/lifecycle/LiveData;", "sharedPrefs", "Landroid/content/SharedPreferences;", "key", "", "defValue", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)V", "getDefValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKey", "()Ljava/lang/String;", "preferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "getValueFromPreferences", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "onActive", "", "onInactive", "RoomObserveKotlin_debug"})
public abstract class SharedPreferenceLiveData<T extends java.lang.Object> extends androidx.lifecycle.LiveData<T> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPrefs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    private final T defValue = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener preferenceChangeListener = null;
    
    public SharedPreferenceLiveData(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPrefs, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T defValue) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final T getDefValue() {
        return null;
    }
    
    public abstract T getValueFromPreferences(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T defValue);
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
}