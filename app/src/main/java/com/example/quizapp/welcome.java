package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class welcome extends AppCompatActivity {
    Button proceed_btn;
    Button rev_btn;
    EditText name, roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        name=findViewById(R.id.welcome_name);
        roll=findViewById(R.id.rollNo);
        proceed_btn=findViewById(R.id.proceed);
        proceed_btn.setOnClickListener(v -> {
            String student_name=name.getText().toString();
            String student_roll=roll.getText().toString();
            Intent nextScreen = new Intent(getApplicationContext(),Mcqs.class);
            nextScreen.putExtra("Name", student_name);
            nextScreen.putExtra("RollNum",student_roll);
            startActivity(nextScreen);
        });
        rev_btn=findViewById(R.id.revise_btn);
        rev_btn.setOnClickListener(v -> {
            String url = "https://useenglishwords.com/results/makharij-al-huroof/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

    }
}