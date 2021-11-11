package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button github_repo;
    Button quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        github_repo=findViewById(R.id.button_repo);
        quiz=findViewById(R.id.button_app);
        github_repo.setOnClickListener(v -> {
            String url = "https://github.com/BSamim/Quiz-App";
            Intent openRepo = new Intent(Intent.ACTION_VIEW);
            openRepo.setData(Uri.parse(url));
            startActivity(openRepo);
        });
        quiz.setOnClickListener(v ->{
            Intent X = new Intent(getApplicationContext(), welcome.class);
            startActivity(X);
        });
    }
}