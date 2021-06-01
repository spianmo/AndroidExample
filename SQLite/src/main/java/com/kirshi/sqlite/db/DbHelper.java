package com.kirshi.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Finger
 */
public class DbHelper extends SQLiteOpenHelper {

    private static final String CREATE_TABLE_STUDENT = "CREATE TABLE t_student(_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(20),classmate VARCHAR(30),age INTEGER)";

    public DbHelper(Context context) {
        super(context, "student.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DbHelper.CREATE_TABLE_STUDENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
