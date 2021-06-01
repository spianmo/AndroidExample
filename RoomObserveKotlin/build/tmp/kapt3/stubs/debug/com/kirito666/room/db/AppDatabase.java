package com.kirito666.room.db;

import java.lang.System;

/**
 * @author Finger
 */
@androidx.room.Database(entities = {com.kirito666.room.db.Student.class, com.kirito666.room.component.CourseModel.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/kirito666/room/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "courseDao", "Lcom/kirito666/room/db/CourseDao;", "studentDao", "Lcom/kirito666/room/db/StudentDao;", "Companion", "RoomObserveKotlin_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.kirito666.room.db.AppDatabase.Companion Companion = null;
    private static com.kirito666.room.db.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kirito666.room.db.StudentDao studentDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kirito666.room.db.CourseDao courseDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kirito666/room/db/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/kirito666/room/db/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "RoomObserveKotlin_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kirito666.room.db.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.kirito666.room.db.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}