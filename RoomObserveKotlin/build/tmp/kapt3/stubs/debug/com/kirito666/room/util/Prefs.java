package com.kirito666.room.util;

import java.lang.System;

/**
 * Intro：
 * Prefs
 * @author sunliwei
 * @date 2020/6/24 11:58
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0007J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/kirito666/room/util/Prefs;", "", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getBoolean", "", "key", "", "defV", "getInt", "", "getLong", "", "getString", "save", "", "value", "RoomObserveKotlin_debug"})
public final class Prefs {
    @org.jetbrains.annotations.NotNull()
    public static final com.kirito666.room.util.Prefs INSTANCE = null;
    private static final android.content.SharedPreferences sharedPreferences = null;
    
    private Prefs() {
        super();
    }
    
    /**
     * 保存
     * @param key 键
     * @param value 值
     */
    public static final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defV) {
        return null;
    }
    
    public static final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defV) {
        return 0;
    }
    
    public static final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defV) {
        return false;
    }
    
    public static final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defV) {
        return 0L;
    }
}