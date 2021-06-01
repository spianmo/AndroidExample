package com.kirshi.sqlite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kirshi.sqlite.bean.Student;
import com.kirshi.sqlite.databinding.ItemStudentBinding;

import java.util.List;

/**
 * @author Finger
 */
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private final List<Student> list;
    private final Context mContext;


    public StudentAdapter(List<Student> list, Context context) {
        this.mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemStudentBinding v = ItemStudentBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.v.tvName.setText(list.get(position).getName());
        holder.v.tvClass.setText(list.get(position).getClassmate());
        holder.v.tvAge.setText(String.valueOf(list.get(position).getAge()));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public void refresh() {
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ItemStudentBinding v;

        public ViewHolder(ItemStudentBinding binding) {
            super(binding.getRoot());
            v = binding;
        }
    }
}

