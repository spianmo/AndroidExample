// Generated by data binding compiler. Do not edit!
package com.kirito666.room.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kirito666.room.R;
import com.kirito666.room.component.SelectInt;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemWeekNumberItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvWeekNumberItem;

  @Bindable
  protected SelectInt mSelectInt;

  protected ItemWeekNumberItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tvWeekNumberItem) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvWeekNumberItem = tvWeekNumberItem;
  }

  public abstract void setSelectInt(@Nullable SelectInt selectInt);

  @Nullable
  public SelectInt getSelectInt() {
    return mSelectInt;
  }

  @NonNull
  public static ItemWeekNumberItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_week_number_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemWeekNumberItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemWeekNumberItemBinding>inflateInternal(inflater, R.layout.item_week_number_item, root, attachToRoot, component);
  }

  @NonNull
  public static ItemWeekNumberItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_week_number_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemWeekNumberItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemWeekNumberItemBinding>inflateInternal(inflater, R.layout.item_week_number_item, null, false, component);
  }

  public static ItemWeekNumberItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemWeekNumberItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemWeekNumberItemBinding)bind(component, view, R.layout.item_week_number_item);
  }
}