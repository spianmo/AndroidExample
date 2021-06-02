package com.kirito666.room.pojo;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\fH\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\nH\u00c6\u0003J\t\u0010A\u001a\u00020\fH\u00c6\u0003J\t\u0010B\u001a\u00020\fH\u00c6\u0003J\t\u0010C\u001a\u00020\fH\u00c6\u0003J\u009c\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u00d6\u0003J\t\u0010J\u001a\u00020\fH\u00d6\u0001J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001c\u00a8\u0006L"}, d2 = {"Lcom/kirito666/room/pojo/CourseModel;", "Ljava/io/Serializable;", "uid", "", "cid", "", "cname", "schoolYear", "term", "credit", "", "startSection", "", "endSection", "startWeek", "endWeek", "dayOfWeek", "classroom", "teacher", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIIIILjava/lang/String;Ljava/lang/String;)V", "getCid", "()Ljava/lang/Long;", "setCid", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getClassroom", "()Ljava/lang/String;", "setClassroom", "(Ljava/lang/String;)V", "getCname", "setCname", "getCredit", "()F", "setCredit", "(F)V", "getDayOfWeek", "()I", "setDayOfWeek", "(I)V", "getEndSection", "setEndSection", "getEndWeek", "setEndWeek", "getSchoolYear", "setSchoolYear", "getStartSection", "setStartSection", "getStartWeek", "setStartWeek", "getTeacher", "setTeacher", "getTerm", "setTerm", "getUid", "setUid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIIIILjava/lang/String;Ljava/lang/String;)Lcom/kirito666/room/pojo/CourseModel;", "equals", "", "other", "", "hashCode", "toString", "RoomObserveKotlin_debug"})
public final class CourseModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String uid;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long cid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String schoolYear;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String term;
    private float credit;
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
    public final com.kirito666.room.pojo.CourseModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String uid, @org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, @org.jetbrains.annotations.Nullable()
    java.lang.String schoolYear, @org.jetbrains.annotations.Nullable()
    java.lang.String term, float credit, int startSection, int endSection, int startWeek, int endWeek, int dayOfWeek, @org.jetbrains.annotations.Nullable()
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
    java.lang.String uid, @org.jetbrains.annotations.Nullable()
    java.lang.Long cid, @org.jetbrains.annotations.NotNull()
    java.lang.String cname, @org.jetbrains.annotations.Nullable()
    java.lang.String schoolYear, @org.jetbrains.annotations.Nullable()
    java.lang.String term, float credit, int startSection, int endSection, int startWeek, int endWeek, int dayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.String classroom, @org.jetbrains.annotations.Nullable()
    java.lang.String teacher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCname() {
        return null;
    }
    
    public final void setCname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSchoolYear() {
        return null;
    }
    
    public final void setSchoolYear(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerm() {
        return null;
    }
    
    public final void setTerm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getCredit() {
        return 0.0F;
    }
    
    public final void setCredit(float p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getStartSection() {
        return 0;
    }
    
    public final void setStartSection(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getEndSection() {
        return 0;
    }
    
    public final void setEndSection(int p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getStartWeek() {
        return 0;
    }
    
    public final void setStartWeek(int p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getEndWeek() {
        return 0;
    }
    
    public final void setEndWeek(int p0) {
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getDayOfWeek() {
        return 0;
    }
    
    public final void setDayOfWeek(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
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
    public final java.lang.String component13() {
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