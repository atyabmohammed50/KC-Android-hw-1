package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = findViewById(R.id.title);
        EditText num1 = findViewById(R.id.Num1);
        EditText num2 = findViewById(R.id.Num2);
        EditText num3 = findViewById(R.id.Num3);
        EditText num4 = findViewById(R.id.Num4);
        Button calculate = findViewById(R.id.Calculate);
        TextView total = findViewById(R.id.Total);
        Button reset = findViewById(R.id.Reset);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int number3 = Integer.parseInt(num3.getText().toString());
        int number4 = Integer.parseInt(num4.getText().toString());
        int result = number1 + number2 + number3 + number4;

        total.setText(String.valueOf(result));

            }
        });

    }


}