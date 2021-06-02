package com.kirito666.room.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * ViewHolder
 */
public class ViewHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding binding;

    ViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    ViewDataBinding getBinding() {
        return binding;
    }

    void setBinding(ViewDataBinding binding) {
        this.binding = binding;
    }
}
