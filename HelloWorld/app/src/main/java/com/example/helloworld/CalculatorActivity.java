package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1, btn2, btn3;
    TextView tv1, tv2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setAttribute();
    }

    void setAttribute(){
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tv1 = findViewById(R.id.txt_result);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSum();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showContent();
            }
        });
    }

    void calculateSum(){
        try {
            double a = Double.parseDouble(txt1.getText().toString());
            double b = Double.parseDouble(txt2.getText().toString());
            double sum = a + b;
            tv1.setText(String.valueOf(sum));
        }catch (Exception e){
            tv1.setText("Missing input number!");
        }
    }

    void showContent() {
        setContentView(R.layout.activity_main3);
        tv2 = findViewById(R.id.tv2);
        try {
            Double.parseDouble(tv1.getText().toString());
            tv2.setText(tv1.getText());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
                setAttribute();
            }
        });
    }
}
