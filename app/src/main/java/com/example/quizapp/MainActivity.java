package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button repo;
    Button app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repo.findViewById(R.id.button_repo);
        app.findViewById(R.id.button_app);
        repo.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        String url = "https://github.com/BSamim/Quiz-App";
        Intent openRepo = new Intent(Intent.ACTION_VIEW);
        openRepo.setData(Uri.parse(url));
        startActivity(openRepo);
    }
}