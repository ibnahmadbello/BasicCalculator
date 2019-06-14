package com.example.ibnahmad.basiccalculator;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView resultTextView, operatorTextView;
    private EditText editTextOne, editTextTwo;
    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
    buttonEight, buttonNine, buttonZero, buttonPlus, buttonMinus, buttonMultiply, buttonDivide,
    buttonEqualsTo, buttonClearScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_display);
        operatorTextView = findViewById(R.id.operator);

        editTextOne = findViewById(R.id.calculation_area_one);
        editTextOne.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null){
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
                return true;
            }
        });

        editTextTwo = findViewById(R.id.calculation_area_two);
        editTextTwo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null){
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
                return true;
            }
        });

        buttonOne = findViewById(R.id.one);
        buttonOne.setOnClickListener(this);

        buttonTwo = findViewById(R.id.two);
        buttonTwo.setOnClickListener(this);

        buttonThree = findViewById(R.id.three);
        buttonThree.setOnClickListener(this);

        buttonFour = findViewById(R.id.four);
        buttonFour.setOnClickListener(this);

        buttonFive = findViewById(R.id.five);
        buttonFive.setOnClickListener(this);

        buttonSix = findViewById(R.id.six);
        buttonSix.setOnClickListener(this);

        buttonSeven = findViewById(R.id.seven);
        buttonSeven.setOnClickListener(this);

        buttonEight = findViewById(R.id.eight);
        buttonEight.setOnClickListener(this);

        buttonNine = findViewById(R.id.nine);
        buttonNine.setOnClickListener(this);

        buttonZero = findViewById(R.id.zero);
        buttonZero.setOnClickListener(this);

        buttonPlus = findViewById(R.id.plus);
        buttonPlus.setOnClickListener(this);

        buttonMinus = findViewById(R.id.minus);
        buttonMinus.setOnClickListener(this);

        buttonMultiply = findViewById(R.id.multiply);
        buttonMultiply.setOnClickListener(this);

        buttonDivide = findViewById(R.id.divide);
        buttonDivide.setOnClickListener(this);

        buttonEqualsTo = findViewById(R.id.equals_to);
        buttonEqualsTo.setOnClickListener(this);

        buttonClearScreen = findViewById(R.id.clear_screen);
        buttonClearScreen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clear_screen:
                operatorTextView.setText("");
                resultTextView.setText("");
                editTextOne.setText("");
                editTextTwo.setText("");
                break;
            case R.id.plus:
                operatorTextView.setText("+");
                break;
            case R.id.minus:
                operatorTextView.setText("-");
                break;
            case R.id.multiply:
                operatorTextView.setText("*");
                break;
            case R.id.divide:
                operatorTextView.setText("/");
                break;
            case R.id.one:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("1");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("1");
                }
                break;
            case R.id.two:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("2");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("2");
                }
                break;
            case R.id.three:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("3");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("3");
                }
                break;
            case R.id.four:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("4");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("4");
                }
                break;
            case R.id.five:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("5");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("5");
                }
                break;
            case R.id.six:
                if (editTextOne.isFocused()){
                    editTextOne.setInputType(InputType.TYPE_NULL);
                    editTextOne.getText().append("6");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.setInputType(InputType.TYPE_NULL);
                    editTextTwo.getText().append("6");
                }
                break;
            case R.id.seven:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("7");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("7");
                }
                break;
            case R.id.eight:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("8");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("8");
                }
                break;
            case R.id.nine:
                if (editTextOne.isFocused()){
                    editTextOne.getText().append("9");
                } else if (editTextTwo.isFocused()){
                    editTextTwo.getText().append("9");
                }
                break;
            case R.id.zero:
                if (editTextOne.isFocused() && editTextOne.getText().length() != 0){
                    editTextOne.getText().append("0");
                } else if (editTextTwo.isFocused() && editTextTwo.getText().length() != 0){
                    editTextTwo.getText().append("0");
                }
                break;
            case R.id.equals_to:
                if (operatorTextView.getText().toString().isEmpty()){
                    Toast.makeText(this, "Please select a valid operator.", Toast.LENGTH_SHORT).show();
                } else {
                    if (editTextOne.getText().length() == 0 || editTextTwo.getText().length() == 0){
                        return;
                    }
                    calculateResult();
                }
                break;
            default:
                break;
        }
    }

    private void calculateResult() {
        int firstNumber = Integer.parseInt(editTextOne.getText().toString());
        int secondNumber = Integer.parseInt(editTextTwo.getText().toString());
        String mathOperator = operatorTextView.getText().toString();
        int result = subCalculation(firstNumber, secondNumber, mathOperator);
        resultTextView.setText(String.format("Result is %d", result));
    }

    private int subCalculation(int firstNumber, int secondNumber, String mathOperator) {
        int result = 0;
        switch (mathOperator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                break;
        }
        return result;
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
