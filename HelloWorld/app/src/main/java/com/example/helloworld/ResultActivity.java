package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv2 = findViewById(R.id.tv2);

        double result = getIntent().getDoubleExtra("result", 0.0);
        tv2.setText(String.valueOf(result));
    }
}
