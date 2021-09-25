package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionX(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String str = myTextField.getText().toString();

        EditText myTextFieldTwo = (EditText) findViewById(R.id.numberTwo);
        String str2 = myTextFieldTwo.getText().toString();

        int firstNumber = Integer.parseInt(str);
        int secondNumber = Integer.parseInt(str2);

        int result = firstNumber * secondNumber;

        goToActivity2(Integer.toString(result));
    }

    public void clickFunctionDivide(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String str = myTextField.getText().toString();

        EditText myTextFieldTwo = (EditText) findViewById(R.id.numberTwo);
        String str2 = myTextFieldTwo.getText().toString();

        int firstNumber = Integer.parseInt(str);
        int secondNumber = Integer.parseInt(str2);

        int result = firstNumber / secondNumber;

        goToActivity2(Integer.toString(result));
    }

    public void clickFunctionAdd(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String str = myTextField.getText().toString();

        EditText myTextFieldTwo = (EditText) findViewById(R.id.numberTwo);
        String str2 = myTextFieldTwo.getText().toString();

        int firstNumber = Integer.parseInt(str);
        int secondNumber = Integer.parseInt(str2);

        int result = firstNumber + secondNumber;

        goToActivity2(Integer.toString(result));
    }

    public void clickFunctionSubtract(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String str = myTextField.getText().toString();

        EditText myTextFieldTwo = (EditText) findViewById(R.id.numberTwo);
        String str2 = myTextFieldTwo.getText().toString();

        int firstNumber = Integer.parseInt(str);
        int secondNumber = Integer.parseInt(str2);

        int result = firstNumber - secondNumber;

        goToActivity2(Integer.toString(result));
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}