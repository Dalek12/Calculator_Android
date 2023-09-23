package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textViewResult = findViewById(R.id.textViewResult);

        int result = getIntent().getIntExtra("result", 0);
        textViewResult.setText("Result: " + result);
    }
}