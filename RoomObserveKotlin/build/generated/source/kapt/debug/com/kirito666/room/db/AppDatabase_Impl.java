package com.kirito666.room.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile StudentDao _studentDao;

  private volatile CourseDao _courseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Student` (`name` TEXT NOT NULL, `clazz` TEXT NOT NULL, `age` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CourseModel` (`uid` TEXT, `cid` INTEGER PRIMARY KEY AUTOINCREMENT, `cname` TEXT, `schoolYear` TEXT, `term` TEXT, `credit` REAL NOT NULL, `startSection` INTEGER NOT NULL, `endSection` INTEGER NOT NULL, `startWeek` INTEGER NOT NULL, `endWeek` INTEGER NOT NULL, `dayOfWeek` INTEGER NOT NULL, `classroom` TEXT, `teacher` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7cd282cd3d79a7fafd52b607d38b2ce1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Student`");
        _db.execSQL("DROP TABLE IF EXISTS `CourseModel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsStudent = new HashMap<String, TableInfo.Column>(4);
        _columnsStudent.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudent.put("clazz", new TableInfo.Column("clazz", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudent.put("age", new TableInfo.Column("age", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudent.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStudent = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStudent = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStudent = new TableInfo("Student", _columnsStudent, _foreignKeysStudent, _indicesStudent);
        final TableInfo _existingStudent = TableInfo.read(_db, "Student");
        if (! _infoStudent.equals(_existingStudent)) {
          return new RoomOpenHelper.ValidationResult(false, "Student(com.kirito666.room.db.Student).\n"
                  + " Expected:\n" + _infoStudent + "\n"
                  + " Found:\n" + _existingStudent);
        }
        final HashMap<String, TableInfo.Column> _columnsCourseModel = new HashMap<String, TableInfo.Column>(13);
        _columnsCourseModel.put("uid", new TableInfo.Column("uid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("cid", new TableInfo.Column("cid", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("cname", new TableInfo.Column("cname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("schoolYear", new TableInfo.Column("schoolYear", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("term", new TableInfo.Column("term", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("credit", new TableInfo.Column("credit", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("startSection", new TableInfo.Column("startSection", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("endSection", new TableInfo.Column("endSection", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("startWeek", new TableInfo.Column("startWeek", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("endWeek", new TableInfo.Column("endWeek", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("dayOfWeek", new TableInfo.Column("dayOfWeek", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("classroom", new TableInfo.Column("classroom", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCourseModel.put("teacher", new TableInfo.Column("teacher", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCourseModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCourseModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCourseModel = new TableInfo("CourseModel", _columnsCourseModel, _foreignKeysCourseModel, _indicesCourseModel);
        final TableInfo _existingCourseModel = TableInfo.read(_db, "CourseModel");
        if (! _infoCourseModel.equals(_existingCourseModel)) {
          return new RoomOpenHelper.ValidationResult(false, "CourseModel(com.kirito666.room.component.CourseModel).\n"
                  + " Expected:\n" + _infoCourseModel + "\n"
                  + " Found:\n" + _existingCourseModel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7cd282cd3d79a7fafd52b607d38b2ce1", "47c77489c87ce84b2d34e8c5cb20e3c6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Student","CourseModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Student`");
      _db.execSQL("DELETE FROM `CourseModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(StudentDao.class, StudentDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CourseDao.class, CourseDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public StudentDao studentDao() {
    if (_studentDao != null) {
      return _studentDao;
    } else {
      synchronized(this) {
        if(_studentDao == null) {
          _studentDao = new StudentDao_Impl(this);
        }
        return _studentDao;
      }
    }
  }

  @Override
  public CourseDao courseDao() {
    if (_courseDao != null) {
      return _courseDao;
    } else {
      synchronized(this) {
        if(_courseDao == null) {
          _courseDao = new CourseDao_Impl(this);
        }
        return _courseDao;
      }
    }
  }
}
