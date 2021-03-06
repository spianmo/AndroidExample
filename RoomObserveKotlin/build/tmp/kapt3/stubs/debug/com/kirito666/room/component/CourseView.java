package com.kirito666.room.component;

import java.lang.System;

/**
 * @author Finger
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0017\u0018\u0000 U2\u00020\u0001:\u0001UB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010-\u001a\u00020\"J\u0006\u0010.\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0002J \u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u00072\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u000108H\u0002J\u0010\u00109\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0002J\u0016\u0010:\u001a\u00020\"2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001908H\u0002J\u0010\u0010<\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010\fJ(\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180?2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001908H\u0002J\b\u0010@\u001a\u00020\u0007H\u0002J\b\u0010A\u001a\u00020\u0007H\u0002J\u0016\u0010B\u001a\u00020\"2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u000108J\u0012\u0010C\u001a\u00020\"2\b\u0010=\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010D\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0014J0\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020\'2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0007H\u0014J\u0018\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0014J\u000e\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\u0007J\u000e\u0010P\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010Q\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0007J>\u0010R\u001a\u00020\"26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001cJ\u000e\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020\'J\u000e\u0010(\u001a\u00020\"2\u0006\u0010T\u001a\u00020\'R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006V"}, d2 = {"Lcom/kirito666/room/component/CourseView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CourseColorArrIndex", "courseColors", "", "", "[Ljava/lang/String;", "currentWeek", "dayOfWeek", "gridItemHeight", "gridItemWidth", "itemMargin", "mCaldender", "Ljava/util/Calendar;", "mDividerPaint", "Landroid/graphics/Paint;", "mList", "", "Lcom/kirito666/room/model/CourseModel;", "mTitlePaint", "onCourseItemClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "course", "", "screenHeight", "screenWidth", "sectionWidth", "showAbsentCourse", "", "showDivider", "statusBarHeight", "getStatusBarHeight", "()I", "titleHeight", "clear", "currentDayOfWeek", "dp2px", "dpValue", "", "drawHorizontalDivider", "canvas", "Landroid/graphics/Canvas;", "drawOneDayCourse", "day", "courses", "", "drawVerticalDivider", "drawViews", "list", "getColorIndex", "courseName", "getOneDayCourses", "", "getScreenHeight", "getScreenWidth", "loadCourses", "matchCourseName", "onDraw", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setCourseItemHeight", "itemHeight", "setCourseItemMargin", "setCurrentWeek", "setOnCourseItemClickListener", "showAbsent", "isShow", "Companion", "RoomObserveKotlin_debug"})
public final class CourseView extends android.view.ViewGroup {
    private java.util.Calendar mCaldender;
    private final java.util.List<com.kirito666.room.model.CourseModel> mList = null;
    private final int screenWidth = 0;
    private int screenHeight;
    private final int gridItemWidth = 0;
    private int gridItemHeight;
    private final int titleHeight = 0;
    private final int sectionWidth = 0;
    private final android.graphics.Paint mDividerPaint = null;
    private final android.graphics.Paint mTitlePaint = null;
    private final java.lang.String[] dayOfWeek = {"\u4e00", "\u4e8c", "\u4e09", "\u56db", "\u4e94", "\u516d", "\u65e5"};
    private final java.lang.String[] courseColors = null;
    private int CourseColorArrIndex = 0;
    private int currentWeek;
    private boolean showAbsentCourse = true;
    private int itemMargin = 1;
    private boolean showDivider = false;
    private kotlin.jvm.functions.Function2<? super android.view.View, ? super com.kirito666.room.model.CourseModel, kotlin.Unit> onCourseItemClickListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.kirito666.room.component.CourseView.Companion Companion = null;
    private static final int MAX_DAY = 7;
    private static final int MAX_SECTION = 12;
    @org.jetbrains.annotations.NotNull()
    private static final int[] Colors = {2131165382, 2131165386, 2131165394, 2131165383, 2131165392, 2131165393, 2131165391, 2131165384, 2131165385, 2131165389, 2131165390, 2131165388, 2131165395, 2131165384, 2131165385, 2131165389, 2131165390, 2131165388, 2131165395, 2131165388, 2131165395, 2131165384, 2131165385, 2131165389, 2131165390, 2131165388, 2131165395};
    
    public CourseView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CourseView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CourseView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    private final void drawViews(java.util.List<com.kirito666.room.model.CourseModel> list) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    /**
     * ??????????????????,??????????????????????????????????????????????????????,???????????????????????????
     */
    private final void drawOneDayCourse(int day, java.util.List<com.kirito666.room.model.CourseModel> courses) {
    }
    
    public final void loadCourses(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kirito666.room.model.CourseModel> list) {
    }
    
    public final void clear() {
    }
    
    public final void setCourseItemMargin(int itemMargin) {
    }
    
    public final void setCourseItemHeight(int itemHeight) {
    }
    
    public final void setCurrentWeek(int currentWeek) {
    }
    
    public final void showAbsent(boolean isShow) {
    }
    
    public final void showDivider(boolean isShow) {
    }
    
    private final java.util.Map<java.lang.Integer, java.util.List<com.kirito666.room.model.CourseModel>> getOneDayCourses(java.util.List<com.kirito666.room.model.CourseModel> list) {
        return null;
    }
    
    /**
     * ????????????????????????????????????
     */
    private final void drawVerticalDivider(android.graphics.Canvas canvas) {
    }
    
    /**
     * ????????????????????????????????????
     */
    private final void drawHorizontalDivider(android.graphics.Canvas canvas) {
    }
    
    /**
     * ??????????????????
     */
    private final int getScreenWidth() {
        return 0;
    }
    
    /**
     * ??????????????????
     */
    private final int getScreenHeight() {
        return 0;
    }
    
    private final int getStatusBarHeight() {
        return 0;
    }
    
    private final int dp2px(float dpValue) {
        return 0;
    }
    
    /**
     * ??????????????????????????????,?????????????????????????????????,????????????????????????
     */
    private final void matchCourseName(java.lang.String courseName) {
    }
    
    /**
     * ??????????????????????????????
     */
    public final int currentDayOfWeek() {
        return 0;
    }
    
    /**
     * ???????????????????????????????????????
     */
    public final int getColorIndex(@org.jetbrains.annotations.Nullable()
    java.lang.String courseName) {
        return 0;
    }
    
    public final void setOnCourseItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super com.kirito666.room.model.CourseModel, kotlin.Unit> onCourseItemClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/kirito666/room/component/CourseView$Companion;", "", "()V", "Colors", "", "getColors", "()[I", "MAX_DAY", "", "MAX_SECTION", "RoomObserveKotlin_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final int[] getColors() {
            return null;
        }
    }
}