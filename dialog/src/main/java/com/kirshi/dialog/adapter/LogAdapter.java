package com.kirshi.dialog.adapter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.kirshi.dialog.R;

import java.util.ArrayList;
import java.util.List;

/*
 * Copyright (c) 2020
 * @Project:TrackerProject
 * @Author:Finger
 * @FileName:LogAdapter.java
 * @LastModified:2020-10-30T08:32:06.646+08:00
 */

/**
 * @author Finger
 */
public class LogAdapter extends RecyclerView.Adapter<LogAdapter.ItemHolder> {

    private final List<LogBean> mDataList = new ArrayList<>();

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_log, parent, false));
    }

    @Override
    public void onBindViewHolder(final ItemHolder holder, int position) {
        LogBean bean = mDataList.get(position);

        if (bean != null) holder.mLog.setText(bean.mTime + " " + bean.mLog);

        holder.itemView.setOnLongClickListener(v -> {
            ClipboardManager cmb = (ClipboardManager) v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            LogBean log = mDataList.get(holder.getAdapterPosition());
            String msg = log.mWho;
            cmb.setPrimaryClip(ClipData.newPlainText(null, msg));
            Toast.makeText(v.getContext(), "已复制到剪贴板", Toast.LENGTH_LONG).show();
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public List<LogBean> getDataList() {
        return mDataList;
    }

    static class ItemHolder extends RecyclerView.ViewHolder {
        TextView mLog;

        ItemHolder(View itemView) {
            super(itemView);
            mLog = itemView.findViewById(R.id.logtext);
        }
    }
}