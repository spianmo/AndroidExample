package com.kirshi.dialog.dialog;

import android.content.Intent;
import android.os.Bundle;

import com.kirshi.dialog.ResultActivity;
import com.kirshi.dialog.base.BaseDialogFragment;
import com.kirshi.dialog.databinding.FragmentDialogCalculatorBinding;

/**
 * @author Finger
 */
public class CalculatorDialog extends BaseDialogFragment<FragmentDialogCalculatorBinding> {

    @Override
    public void inCreateView() {
        v.btnJump.setOnClickListener(view -> {
            String num1 = v.edNum1.getText().toString();
            String num2 = v.edNum2.getText().toString();
            CalculatorDialog.this.dismiss();
            Intent intent = new Intent(getActivity(), ResultActivity.class);
            Bundle nums = new Bundle();
            nums.putString("num1", num1);
            nums.putString("num2", num2);
            intent.putExtra("nums", nums);
            startActivity(intent);
        });

        v.btnCancel.setOnClickListener(view -> CalculatorDialog.this.dismiss());
    }
}
