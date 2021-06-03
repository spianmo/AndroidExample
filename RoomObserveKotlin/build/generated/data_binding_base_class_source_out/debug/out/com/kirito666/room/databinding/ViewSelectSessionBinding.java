// Generated by view binder compiler. Do not edit!
package com.kirito666.room.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.slider.RangeSlider;
import com.kirito666.room.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewSelectSessionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RangeSlider rangeSlider;

  private ViewSelectSessionBinding(@NonNull ConstraintLayout rootView,
      @NonNull RangeSlider rangeSlider) {
    this.rootView = rootView;
    this.rangeSlider = rangeSlider;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSelectSessionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewSelectSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_select_session, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewSelectSessionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rangeSlider;
      RangeSlider rangeSlider = rootView.findViewById(id);
      if (rangeSlider == null) {
        break missingId;
      }

      return new ViewSelectSessionBinding((ConstraintLayout) rootView, rangeSlider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
