package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class welcome extends AppCompatActivity {
    Button proceed_btn;
    Button rev_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        rev_btn=findViewById(R.id.revise_btn);
        rev_btn.setOnClickListener(v -> {
            String url = "https://useenglishwords.com/results/makharij-al-huroof/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }
}