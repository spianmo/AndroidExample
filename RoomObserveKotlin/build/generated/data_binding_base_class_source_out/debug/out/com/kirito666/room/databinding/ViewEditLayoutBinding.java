// Generated by view binder compiler. Do not edit!
package com.kirito666.room.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kirito666.room.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewEditLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton cancel;

  @NonNull
  public final TextInputEditText editText;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final Guideline guideline33;

  @NonNull
  public final Guideline guideline34;

  @NonNull
  public final AppCompatButton ok;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextView title;

  private ViewEditLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton cancel,
      @NonNull TextInputEditText editText, @NonNull Guideline guideline17,
      @NonNull Guideline guideline33, @NonNull Guideline guideline34, @NonNull AppCompatButton ok,
      @NonNull TextInputLayout textInputLayout, @NonNull TextView title) {
    this.rootView = rootView;
    this.cancel = cancel;
    this.editText = editText;
    this.guideline17 = guideline17;
    this.guideline33 = guideline33;
    this.guideline34 = guideline34;
    this.ok = ok;
    this.textInputLayout = textInputLayout;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewEditLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewEditLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_edit_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewEditLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel;
      AppCompatButton cancel = rootView.findViewById(id);
      if (cancel == null) {
        break missingId;
      }

      id = R.id.editText;
      TextInputEditText editText = rootView.findViewById(id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.guideline17;
      Guideline guideline17 = rootView.findViewById(id);
      if (guideline17 == null) {
        break missingId;
      }

      id = R.id.guideline33;
      Guideline guideline33 = rootView.findViewById(id);
      if (guideline33 == null) {
        break missingId;
      }

      id = R.id.guideline34;
      Guideline guideline34 = rootView.findViewById(id);
      if (guideline34 == null) {
        break missingId;
      }

      id = R.id.ok;
      AppCompatButton ok = rootView.findViewById(id);
      if (ok == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = rootView.findViewById(id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      return new ViewEditLayoutBinding((ConstraintLayout) rootView, cancel, editText, guideline17,
          guideline33, guideline34, ok, textInputLayout, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}