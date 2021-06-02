package com.kirito666.room.databinding;
import com.kirito666.room.R;
import com.kirito666.room.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemWeekNumberItemBindingImpl extends ItemWeekNumberItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemWeekNumberItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemWeekNumberItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvWeekNumberItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.selectInt == variableId) {
            setSelectInt((com.kirito666.room.component.SelectInt) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectInt(@Nullable com.kirito666.room.component.SelectInt SelectInt) {
        this.mSelectInt = SelectInt;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.selectInt);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfSelectIntNumber = null;
        com.kirito666.room.component.SelectInt selectInt = mSelectInt;
        boolean selectIntSelect = false;
        int selectIntSelectTvWeekNumberItemAndroidColorWhiteTvWeekNumberItemAndroidColorBlack = 0;
        int selectIntNumber = 0;
        android.graphics.drawable.Drawable selectIntSelectTvWeekNumberItemAndroidDrawableButtonBackgroundJavaLangObjectNull = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (selectInt != null) {
                    // read selectInt.select
                    selectIntSelect = selectInt.getSelect();
                    // read selectInt.number
                    selectIntNumber = selectInt.getNumber();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(selectIntSelect) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read selectInt.select ? @android:color/white : @android:color/black
                selectIntSelectTvWeekNumberItemAndroidColorWhiteTvWeekNumberItemAndroidColorBlack = ((selectIntSelect) ? (getColorFromResource(tvWeekNumberItem, android.R.color.white)) : (getColorFromResource(tvWeekNumberItem, android.R.color.black)));
                // read selectInt.select ? @android:drawable/button_background : null
                selectIntSelectTvWeekNumberItemAndroidDrawableButtonBackgroundJavaLangObjectNull = ((selectIntSelect) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvWeekNumberItem.getContext(), R.drawable.button_background)) : (null));
                // read String.valueOf(selectInt.number)
                stringValueOfSelectIntNumber = java.lang.String.valueOf(selectIntNumber);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvWeekNumberItem, stringValueOfSelectIntNumber);
            this.tvWeekNumberItem.setTextColor(selectIntSelectTvWeekNumberItemAndroidColorWhiteTvWeekNumberItemAndroidColorBlack);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvWeekNumberItem, selectIntSelectTvWeekNumberItemAndroidDrawableButtonBackgroundJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): selectInt
        flag 1 (0x2L): null
        flag 2 (0x3L): selectInt.select ? @android:color/white : @android:color/black
        flag 3 (0x4L): selectInt.select ? @android:color/white : @android:color/black
        flag 4 (0x5L): selectInt.select ? @android:drawable/button_background : null
        flag 5 (0x6L): selectInt.select ? @android:drawable/button_background : null
    flag mapping end*/
    //end
}