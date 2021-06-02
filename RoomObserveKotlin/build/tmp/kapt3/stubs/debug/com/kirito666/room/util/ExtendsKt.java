package com.kirito666.room.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a_\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0002\u001a\u0002H\b2\u0006\u0010\u0003\u001a\u0002H\b26\u0010\t\u001a2\u0012\u0013\u0012\u0011H\b\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u0011H\b\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\r0\nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u001a\u001a\u0010\u0014\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0001\u001a\n\u0010\u0017\u001a\u00020\u0010*\u00020\u0018\u001aQ\u0010\u0019\u001a\u00020\u0010\"\u0004\b\u0000\u0010\b*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\b0\u001e2)\b\u0002\u0010\u001f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\b0\u001e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00100 \u001a\n\u0010\"\u001a\u00020\u0010*\u00020\u0018\u001a\n\u0010#\u001a\u00020\u0012*\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006$"}, d2 = {"ifGreater", "", "t1", "t2", "ifGreaterEqual", "ifLess", "ifLessEqual", "ifValue", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "once", "", "key", "", "Lkotlin/Function0;", "bitCount", "", "maxLen", "hide", "Landroid/view/View;", "load", "Landroidx/recyclerview/widget/RecyclerView;", "mLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "mAdapter", "Lcom/kirito666/room/base/BaseAdapter;", "adapterOp", "Lkotlin/Function1;", "adapter", "show", "supplyZero", "RoomObserveKotlin_debug"})
public final class ExtendsKt {
    
    /**
     * List
     * 列表比特计数
     * 1，3，5 -> 10101
     * 1,2,4 -> 1001
     * @param maxLen 最大长度
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String bitCount(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> $this$bitCount, int maxLen) {
        return null;
    }
    
    /**
     * RecyclerView加载器
     * @param layoutManager 布局
     * @param adapter 适配器
     */
    public static final <T extends java.lang.Object>void load(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$load, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager, @org.jetbrains.annotations.NotNull()
    com.kirito666.room.base.BaseAdapter<T> mAdapter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.kirito666.room.base.BaseAdapter<T>, kotlin.Unit> adapterOp) {
    }
    
    public static final void hide(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hide) {
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show) {
    }
    
    /**
     * 对0 - 9 补前置0
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String supplyZero(int $this$supplyZero) {
        return null;
    }
    
    public static final void once(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public static final <T extends java.lang.Object>T ifValue(T t1, T t2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> block) {
        return null;
    }
    
    public static final int ifGreater(int t1, int t2) {
        return 0;
    }
    
    public static final int ifLess(int t1, int t2) {
        return 0;
    }
    
    public static final int ifGreaterEqual(int t1, int t2) {
        return 0;
    }
    
    public static final int ifLessEqual(int t1, int t2) {
        return 0;
    }
}