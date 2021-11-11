package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mcqs extends AppCompatActivity {
    TextView log_name, log_roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcqs);

        log_name=findViewById(R.id.login_name);
        String str1 = getIntent().getStringExtra("Name");
        log_name.setText(str1);

        log_roll=findViewById(R.id.login_roll);
        String str2 = getIntent().getStringExtra("RollNum");
        log_roll.setText(str2);
    }
}