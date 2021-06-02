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
        return "INSERT OR ABORT INTO `CourseModel` (`uid`,`cid`,`cname`,`schoolYear`,`term`,`credit`,`startSection`,`endSection`,`startWeek`,`endWeek`,`dayOfWeek`,`classroom`,`teacher`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModel value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
        if (value.getCid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCid());
        }
        if (value.getCname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCname());
        }
        if (value.getSchoolYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSchoolYear());
        }
        if (value.getTerm() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTerm());
        }
        stmt.bindDouble(6, value.getCredit());
        stmt.bindLong(7, value.getStartSection());
        stmt.bindLong(8, value.getEndSection());
        stmt.bindLong(9, value.getStartWeek());
        stmt.bindLong(10, value.getEndWeek());
        stmt.bindLong(11, value.getDayOfWeek());
        if (value.getClassroom() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getClassroom());
        }
        if (value.getTeacher() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTeacher());
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
        return "UPDATE OR ABORT `CourseModel` SET `uid` = ?,`cid` = ?,`cname` = ?,`schoolYear` = ?,`term` = ?,`credit` = ?,`startSection` = ?,`endSection` = ?,`startWeek` = ?,`endWeek` = ?,`dayOfWeek` = ?,`classroom` = ?,`teacher` = ? WHERE `cid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CourseModel value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUid());
        }
        if (value.getCid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCid());
        }
        if (value.getCname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCname());
        }
        if (value.getSchoolYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSchoolYear());
        }
        if (value.getTerm() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTerm());
        }
        stmt.bindDouble(6, value.getCredit());
        stmt.bindLong(7, value.getStartSection());
        stmt.bindLong(8, value.getEndSection());
        stmt.bindLong(9, value.getStartWeek());
        stmt.bindLong(10, value.getEndWeek());
        stmt.bindLong(11, value.getDayOfWeek());
        if (value.getClassroom() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getClassroom());
        }
        if (value.getTeacher() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTeacher());
        }
        if (value.getCid() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getCid());
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
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfCid = CursorUtil.getColumnIndexOrThrow(_cursor, "cid");
          final int _cursorIndexOfCname = CursorUtil.getColumnIndexOrThrow(_cursor, "cname");
          final int _cursorIndexOfSchoolYear = CursorUtil.getColumnIndexOrThrow(_cursor, "schoolYear");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final int _cursorIndexOfCredit = CursorUtil.getColumnIndexOrThrow(_cursor, "credit");
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
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
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
            final String _tmpSchoolYear;
            if (_cursor.isNull(_cursorIndexOfSchoolYear)) {
              _tmpSchoolYear = null;
            } else {
              _tmpSchoolYear = _cursor.getString(_cursorIndexOfSchoolYear);
            }
            final String _tmpTerm;
            if (_cursor.isNull(_cursorIndexOfTerm)) {
              _tmpTerm = null;
            } else {
              _tmpTerm = _cursor.getString(_cursorIndexOfTerm);
            }
            final float _tmpCredit;
            _tmpCredit = _cursor.getFloat(_cursorIndexOfCredit);
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
            _item = new CourseModel(_tmpUid,_tmpCid,_tmpCname,_tmpSchoolYear,_tmpTerm,_tmpCredit,_tmpStartSection,_tmpEndSection,_tmpStartWeek,_tmpEndWeek,_tmpDayOfWeek,_tmpClassroom,_tmpTeacher);
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
