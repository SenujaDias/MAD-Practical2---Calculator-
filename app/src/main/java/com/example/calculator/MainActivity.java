package com.example.calculator;

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

        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);
        Button addButton = findViewById(R.id.addButton);
        Button subButton = findViewById(R.id.subButton);
        Button multiButton = findViewById(R.id.multiButton);
        Button divideButton = findViewById(R.id.divideButton);

        TextView result = findViewById(R.id.resultView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(firstNumber.getText().toString());
                int j = Integer.parseInt(secondNumber.getText().toString());
                int sum = i+j;
                result.setText(String.valueOf(sum));
            }
        });

        subButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                double k = Double.parseDouble(firstNumber.getText().toString());
                double l = Double.parseDouble(secondNumber.getText().toString());

                double difference = k - l ;
                result.setText(String.valueOf(difference));
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double i = Double.parseDouble(firstNumber.getText().toString());
                double j = Double.parseDouble(secondNumber.getText().toString());
                double product = i * j;
                result.setText(String.valueOf(product));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double i = Double.parseDouble(firstNumber.getText().toString());
                double j = Double.parseDouble(secondNumber.getText().toString());
                if (j != 0) {
                    double value = i / j;
                    result.setText(String.valueOf(value));
                } else {
                    result.setText("Cannot divide by zero");
                }
            }
        });




    }
}