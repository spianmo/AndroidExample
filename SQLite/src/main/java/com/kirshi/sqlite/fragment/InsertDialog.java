package com.kirshi.sqlite.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.kirshi.framework.base.BaseDialogFragment;
import com.kirshi.sqlite.R;
import com.kirshi.sqlite.bean.Student;
import com.kirshi.sqlite.databinding.DialogInsertBinding;

public class InsertDialog extends BaseDialogFragment<DialogInsertBinding> {
    String clazz;
    private OnInsertCallback listener;

    @Override
    public void inCreateView() {

        v.spinnerClazz.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                clazz = getResources().getStringArray(R.array.clazz)[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        v.btnInsert.setOnClickListener(view -> {
            String studentName = v.edName.getText().toString();
            int studentAge = Integer.parseInt(v.edAge.getText().toString());
            listener.onCallback(new Student(0, studentName, clazz, studentAge));
            InsertDialog.this.dismiss();
        });

        v.btnCancel.setOnClickListener(v -> {
            listener.onCancel(InsertDialog.this);
            InsertDialog.this.dismiss();
        });
    }

    public void setOnInsertCallback(OnInsertCallback onInsertCallback) {
        this.listener = onInsertCallback;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onStart() {
        WindowManager.LayoutParams params = requireDialog().getWindow().getAttributes();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        requireDialog().getWindow().setAttributes(params);
        super.onStart();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public interface OnInsertCallback {
        void onCallback(Student student);

        void onCancel(DialogFragment dialog);
    }
}

