package com.kirito666.room.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kirito666.room.model.CourseModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CourseDao_Impl implements CourseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CourseModel> __insertionAdapterOfCourseModel;

  private final EntityDeletionOrUpdateAdapter<CourseModel> __deletionAdapterOfCourseModel;

  private final EntityDeletionOrUpdateAdapter<CourseModel> __updateAdapterOfCourseModel;

  public CourseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCourseModel = new EntityInsertionAdapter<CourseModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CourseModel` (`cid`,`cname`,`startSection`,`endSection`,`startWeek`,`endWeek`,`dayOfWeek`,`classroom`,`teacher`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModel value) {
        if (value.getCid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getCid());
        }
        if (value.getCname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCname());
        }
        stmt.bindLong(3, value.getStartSection());
        stmt.bindLong(4, value.getEndSection());
        stmt.bindLong(5, value.getStartWeek());
        stmt.bindLong(6, value.getEndWeek());
        stmt.bindLong(7, value.getDayOfWeek());
        if (value.getClassroom() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getClassroom());
        }
        if (value.getTeacher() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTeacher());
        }
      }
    };
    this.__deletionAdapterOfCourseModel = new EntityDeletionOrUpdateAdapter<CourseModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CourseModel` WHERE `cid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModel value) {
        if (value.getCid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getCid());
        }
      }
    };
    this.__updateAdapterOfCourseModel = new EntityDeletionOrUpdateAdapter<CourseModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CourseModel` SET `cid` = ?,`cname` = ?,`startSection` = ?,`endSection` = ?,`startWeek` = ?,`endWeek` = ?,`dayOfWeek` = ?,`classroom` = ?,`teacher` = ? WHERE `cid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModel value) {
        if (value.getCid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getCid());
        }
        if (value.getCname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCname());
        }
        stmt.bindLong(3, value.getStartSection());
        stmt.bindLong(4, value.getEndSection());
        stmt.bindLong(5, value.getStartWeek());
        stmt.bindLong(6, value.getEndWeek());
        stmt.bindLong(7, value.getDayOfWeek());
        if (value.getClassroom() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getClassroom());
        }
        if (value.getTeacher() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTeacher());
        }
        if (value.getCid() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getCid());
        }
      }
    };
  }

  @Override
  public void insert(final CourseModel course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCourseModel.insert(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CourseModel course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCourseModel.handle(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final CourseModel course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCourseModel.handle(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Integer> getItemsCount() {
    final String _sql = "SELECT COUNT(*) from CourseModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"CourseModel"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<CourseModel>> getAllCourse() {
    final String _sql = "SELECT * from CourseModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"CourseModel"}, false, new Callable<List<CourseModel>>() {
      @Override
      public List<CourseModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCid = CursorUtil.getColumnIndexOrThrow(_cursor, "cid");
          final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
          final int _cursorIndexOfStartSection = CursorUtil.getColumnIndexOrThrow(_cursor, "startSection");
          final int _cursorIndexOfEndSection = CursorUtil.getColumnIndexOrThrow(_cursor, "endSection");
          final int _cursorIndexOfStartWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "startWeek");
          final int _cursorIndexOfEndWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "endWeek");
          final int _cursorIndexOfDayOfWeek = CursorUtil.getColumnIndexOrThrow(_cursor, "dayOfWeek");
          final int _cursorIndexOfClassroom = CursorUtil.getColumnIndexOrThrow(_cursor, "classroom");
          final int _cursorIndexOfTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "teacher");
          final List<CourseModel> _result = new ArrayList<CourseModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CourseModel _item;
            final Long _tmpCid;
            if (_cursor.isNull(_cursorIndexOfCid)) {
              _tmpCid = null;
            } else {
              _tmpCid = _cursor.getLong(_cursorIndexOfCid);
            }
            final String _tmpCname;
            if (_cursor.isNull(_cursorIndexOfCname)) {
              _tmpCname = null;
            } else {
              _tmpCname = _cursor.getString(_cursorIndexOfCname);
            }
            final int _tmpStartSection;
            _tmpStartSection = _cursor.getInt(_cursorIndexOfStartSection);
            final int _tmpEndSection;
            _tmpEndSection = _cursor.getInt(_cursorIndexOfEndSection);
            final int _tmpStartWeek;
            _tmpStartWeek = _cursor.getInt(_cursorIndexOfStartWeek);
            final int _tmpEndWeek;
            _tmpEndWeek = _cursor.getInt(_cursorIndexOfEndWeek);
            final int _tmpDayOfWeek;
            _tmpDayOfWeek = _cursor.getInt(_cursorIndexOfDayOfWeek);
            final String _tmpClassroom;
            if (_cursor.isNull(_cursorIndexOfClassroom)) {
              _tmpClassroom = null;
            } else {
              _tmpClassroom = _cursor.getString(_cursorIndexOfClassroom);
            }
            final String _tmpTeacher;
            if (_cursor.isNull(_cursorIndexOfTeacher)) {
              _tmpTeacher = null;
            } else {
              _tmpTeacher = _cursor.getString(_cursorIndexOfTeacher);
            }
            _item = new CourseModel(_tmpCid,_tmpCname,_tmpStartSection,_tmpEndSection,_tmpStartWeek,_tmpEndWeek,_tmpDayOfWeek,_tmpClassroom,_tmpTeacher);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
