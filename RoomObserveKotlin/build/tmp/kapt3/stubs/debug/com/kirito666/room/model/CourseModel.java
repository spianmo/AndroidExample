package com.kirito666.room.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jn\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u00020\u0007H\u00d6\u0001J\t\u00108\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b\'\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/kirito666/room/model/CourseModel;", "Ljava/io/Serializable;", "cid", "", "cname", "", "startSection", "", "endSection", "startWeek", "endWeek", "dayOfWeek", "classroom", "teacher", "(Ljava/lang/Long;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;)V", "getCid", "()Ljava/lang/Long;", "setCid", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getClassroom", "()Ljava/lang/String;", "setClassroom", "(Ljava/lang/String;)V", "getCname", "setCname", "getDayOfWeek", "()I", "setDayOfWeek", "(I)V", "getEndSection", "setEndSection", "getEndWeek", "setEndWeek", "getStartSection", "setStartSection", "getStartWeek", "setStartWeek", "getTeacher", "setTeacher", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;)Lcom/kirito666/room/model/CourseModel;", "equals", "", "other", "", "hashCode", "toString", "RoomObserveKotlin_debug"})
public final class CourseModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long cid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cname;
    private int startSection;
    private int endSection;
    private int startWeek;
    private int endWeek;
    private int dayOfWeek;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String classroom;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String teacher;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kirito666.room.model.CourseModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection, int startWeek, int endWeek, int dayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.String classroom, @org.jetbrains.annotations.Nullable()
    java.lang.String teacher) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CourseModel() {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection, int startWeek) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection, int startWeek, int endWeek) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection, int startWeek, int endWeek, int dayOfWeek) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection, int startWeek, int endWeek, int dayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.String classroom) {
        super();
    }
    
    public CourseModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, int startSection, int endSection, int startWeek, int endWeek, int dayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.String classroom, @org.jetbrains.annotations.Nullable()
    java.lang.String teacher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCid() {
        return null;
    }
    
    public final void setCid(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCname() {
        return null;
    }
    
    public final void setCname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getStartSection() {
        return 0;
    }
    
    public final void setStartSection(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getEndSection() {
        return 0;
    }
    
    public final void setEndSection(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getStartWeek() {
        return 0;
    }
    
    public final void setStartWeek(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getEndWeek() {
        return 0;
    }
    
    public final void setEndWeek(int p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getDayOfWeek() {
        return 0;
    }
    
    public final void setDayOfWeek(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClassroom() {
        return null;
    }
    
    public final void setClassroom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTeacher() {
        return null;
    }
    
    public final void setTeacher(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}