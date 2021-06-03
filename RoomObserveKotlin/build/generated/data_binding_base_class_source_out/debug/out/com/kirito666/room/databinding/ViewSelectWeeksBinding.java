// Generated by view binder compiler. Do not edit!
package com.kirito666.room.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.kirito666.room.R;
import com.kirito666.room.component.SelectWeekRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewSelectWeeksBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dialogTitle;

  @NonNull
  public final Guideline guideline18;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline20;

  @NonNull
  public final SelectWeekRecyclerView recyclerview;

  private ViewSelectWeeksBinding(@NonNull ConstraintLayout rootView, @NonNull TextView dialogTitle,
      @NonNull Guideline guideline18, @NonNull Guideline guideline19,
      @NonNull Guideline guideline20, @NonNull SelectWeekRecyclerView recyclerview) {
    this.rootView = rootView;
    this.dialogTitle = dialogTitle;
    this.guideline18 = guideline18;
    this.guideline19 = guideline19;
    this.guideline20 = guideline20;
    this.recyclerview = recyclerview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSelectWeeksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewSelectWeeksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_select_weeks, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewSelectWeeksBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog_title;
      TextView dialogTitle = rootView.findViewById(id);
      if (dialogTitle == null) {
        break missingId;
      }

      id = R.id.guideline18;
      Guideline guideline18 = rootView.findViewById(id);
      if (guideline18 == null) {
        break missingId;
      }

      id = R.id.guideline19;
      Guideline guideline19 = rootView.findViewById(id);
      if (guideline19 == null) {
        break missingId;
      }

      id = R.id.guideline20;
      Guideline guideline20 = rootView.findViewById(id);
      if (guideline20 == null) {
        break missingId;
      }

      id = R.id.recyclerview;
      SelectWeekRecyclerView recyclerview = rootView.findViewById(id);
      if (recyclerview == null) {
        break missingId;
      }

      return new ViewSelectWeeksBinding((ConstraintLayout) rootView, dialogTitle, guideline18,
          guideline19, guideline20, recyclerview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
