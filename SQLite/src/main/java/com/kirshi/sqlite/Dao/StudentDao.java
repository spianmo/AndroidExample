package com.kirshi.sqlite.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.kirshi.sqlite.bean.Student;
import com.kirshi.sqlite.db.DbHelper;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private final DbHelper dbHelper;
    private SQLiteDatabase db;

    public StudentDao(Context context) {
        dbHelper = new DbHelper(context);
    }

    public void insert(Student student) {
        db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", student.getName());
        values.put("classmate", student.getClassmate());
        values.put("age", student.getAge());
        db.insert("t_student", null, values);
        db.close();
    }

    public List<Student> selectAll() {
        List<Student> list = new ArrayList<>();
        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query("t_student", null, null, null, null, null, "_id");
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("_id"));
            String name = cursor.getString(cursor.getColumnIndex("name"));
            String classmate = cursor.getString(cursor.getColumnIndex("classmate"));
            int age = cursor.getInt(cursor.getColumnIndex("age"));
            list.add(new Student(id, name, classmate, age));
        }
        cursor.close();
        db.close();
        return list;
    }
}