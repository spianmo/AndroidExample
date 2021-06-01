package com.kirshi.sqlite;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.kirshi.framework.base.BaseActivity;
import com.kirshi.sqlite.Dao.StudentDao;
import com.kirshi.sqlite.adapter.StudentAdapter;
import com.kirshi.sqlite.bean.Student;
import com.kirshi.sqlite.databinding.ActivityMainBinding;
import com.kirshi.sqlite.fragment.InsertDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    StudentAdapter adapter;
    List<Student> students = new ArrayList<>();
    LinearLayoutManager layoutManager;
    StudentDao mStudentDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStudentDao = new StudentDao(mContext);
        adapter = new StudentAdapter(students, mContext);
        layoutManager = new LinearLayoutManager(mContext);
        v.listStudent.setLayoutManager(layoutManager);
        v.listStudent.setAdapter(adapter);

        refresh();

        v.btnInsert.setOnClickListener(view -> {
            InsertDialog dialog = new InsertDialog();
            dialog.setOnInsertCallback(new InsertDialog.OnInsertCallback() {
                @Override
                public void onCallback(Student student) {
                    mStudentDao.insert(student);
                    refresh();
                }

                @Override
                public void onCancel(DialogFragment dialog) {

                }
            });
            dialog.show(getSupportFragmentManager(), "insert");
        });

        v.btnSelect.setOnClickListener(view -> {
            refresh();
        });
    }

    private void refresh() {
        students.clear();
        students.addAll(mStudentDao.selectAll());
        LOGE(students.toString());
        adapter.refresh();
    }
}