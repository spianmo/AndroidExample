package com.kirito.androidexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.googlecode.aviator.AviatorEvaluator;

/**
 * @author Finger
 */
public class CalculatorActivity extends AppCompatActivity {

    private static final String[] OPERATOR = new String[]{"+", "-", "×", "÷"};
    private static final String[] NUMBER = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    private EditText edResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        edResult = findViewById(R.id.ed_result);
    }

    public void clearError(View view) {
        checkEqualSign(false);
        String str = edResult.getText().toString();
        if (!isContainsOperator(str)) {
            edResult.setText("0");
            return;
        }
        edResult.setText(str.substring(0, calLastOperationPosition(str) + 1));
    }

    public void backspace(View view) {
        checkEqualSign(false);
        String str = edResult.getText().toString();
        edResult.setText(str.length() == 1 ? "0" : str.substring(0, edResult.getText().length() - 1));
    }

    public void clear(View view) {
        edResult.setText("0");
    }

    @SuppressLint("SetTextI18n")
    public void calculate(View view) {
        checkEqualSign(true);
        String expression = edResult.getText().toString()
                .replace("×", "*")
                .replace("÷", "/");
        String resultStr = edResult.getText().toString();
        try {
            Object result = AviatorEvaluator.execute(expression);
            edResult.setText(resultStr + (resultStr.endsWith(".") ? "0" : "") + "\n" + "=" + result);
        } catch (ArithmeticException e) {
            edResult.setText(resultStr + (resultStr.endsWith(".") ? "0" : "") + "\n" + "=" + "除数不能为0");
        }
    }

    @SuppressLint("SetTextI18n")
    public void inputFormula(View view) {
        checkEqualSign(true);
        Button button = (Button) view;
        String press = button.getText().toString();
        String currentText = edResult.getText().toString();
        if (isEndsWithOperator(currentText) && isContainsOperator(press)) {
            return;
        }
        if (!"0".equals(currentText)) {
            if ("0".equals(currentText.substring(calLastOperationPosition(currentText) + 1))) {
                return;
            }
        }

        if (isContainsOperator(press) && currentText.endsWith(".")) {
            currentText = currentText + "0";
        }

        if ("0".equals(currentText) && isContainsNumeric(press)) {
            edResult.setText(press);
        } else {
            edResult.setText(currentText + press);
        }
    }

    public void processDot(View view) {
        checkEqualSign(true);
        String currentText = edResult.getText().toString();
        if ("0".equals(currentText)) {
            edResult.setText("0.");
            return;
        }
        if (currentText.endsWith(".")) {
            return;
        }
        if (currentText.contains(".") && !isContainsOperator(currentText)) {
            return;
        }
        if (currentText.substring(calLastOperationPosition(currentText + 1)).contains(".")) {
            return;
        }
        edResult.setText(calLastOperationPosition(currentText) == currentText.length() - 1
                ? currentText + "0." : currentText + ".");
    }

    @SuppressLint("SetTextI18n")
    public void processPercent(View view) {
        checkEqualSign(true);
        String currentText = edResult.getText().toString();
        if (!isContainsOperator(currentText)) {
            edResult.setText(String.valueOf(Double.parseDouble(currentText) / 100));
            return;
        }
        if (isContainsOperator(currentText.substring(currentText.length() - 1))) {
            String processStr = currentText.substring(0, currentText.length() - 1);
            String num = processStr.substring(calLastOperationPosition(processStr));
            edResult.setText(currentText + (Double.parseDouble(num) / 100));
        } else {
            String processStr = currentText.substring(0, calLastOperationPosition(currentText) + 1);
            String num = currentText.substring(calLastOperationPosition(currentText) + 1);
            edResult.setText(processStr + (Double.parseDouble(num) / 100));
        }
    }


    private boolean isEndsWithOperator(String str) {
        for (String item : OPERATOR) {
            if (str.endsWith(item)) {
                return true;
            }
        }
        return false;
    }

    private boolean isContainsOperator(String str) {
        for (String item : OPERATOR) {
            if (str.contains(item)) {
                return true;
            }
        }
        return false;
    }

    private boolean isContainsNumeric(String str) {
        for (String item : NUMBER) {
            if (str.contains(item)) {
                return true;
            }
        }
        return false;
    }

    private void checkEqualSign(boolean usePreResult) {
        String processStr = edResult.getText().toString();
        if (processStr.contains("除数不能为0")) {
            edResult.setText("0");
            return;
        }
        if (edResult.getText().toString().contains("=")) {
            if (!usePreResult) {
                edResult.setText("0");
            } else {
                edResult.setText(processStr.substring(processStr.lastIndexOf("=") + 1));
            }
        }
    }

    private int calLastOperationPosition(String str) {
        int position = 0;
        for (String operator : OPERATOR) {
            int currentOperatorPosition = str.lastIndexOf(operator);
            if (currentOperatorPosition > position) {
                position = currentOperatorPosition;
            }
        }
        return position;
    }
}