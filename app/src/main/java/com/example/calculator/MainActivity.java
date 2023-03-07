package com.example.calculator;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.editTextTextPersonName);
        text2 = findViewById(R.id.editTextTextPersonName2);
        result2 = findViewById(R.id.textView);
        //test

    }

    public void sum (View view) {

       int myint =  Integer.parseInt(text1.getText().toString());
       int myint2 = Integer.parseInt(text2.getText().toString());
       int result = myint + myint2;

       result2.setText("Result: " +result);



       /* int number1 = (Integer.parseInt(text1.toString()));
        int number2 = (Integer.parseInt(text2.toString()));
        String result = valueOf((number1+number2));*/

    }

    public void deduct (View view) {

        int myint = Integer.parseInt(text1.getText().toString());
        int myint2 = Integer.parseInt(text2.getText().toString());
        int result = myint - myint2;

        result2.setText("Result: " +result);
    }

    public void multiply (View view) {

        int myint = Integer.parseInt(text1.getText().toString());
        int myint2 = Integer.parseInt(text2.getText().toString());
        int result = myint * myint2;

        result2.setText("Result: " +result);
    }

    public void divide (View view) {

        int myint = Integer.parseInt(text1.getText().toString());
        int myint2 = Integer.parseInt(text2.getText().toString());
        int result = myint / myint2;

        result2.setText("Result: " +result);
    }

}