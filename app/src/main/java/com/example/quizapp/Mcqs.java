package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Mcqs extends AppCompatActivity {
    TextView log_name, log_roll, question, count;
    RadioGroup radioGroup;
    RadioButton op1,op2,op3,op4;
    public static int correct=0,wrong=0;
    static int counter=0;
    Button submitBtn,quitBtn;
    String[] questions = {
            "Which letters of \"Halqiyah\" originate sound from Middle of Throat?",
            "Pair of letters included in \"Halqiyah\"?",
            "Word ق from \"Lahatiyah\" generates sound from which part of tongue?",
            "Pair of letters \" ض ج ش ی \" are part of which \"makhārij al-ḥurūf\"?",
            "Rounded tip of the tongue touching the base of the frontal 6 teeth can produce sound of which letter?",
            "Tip of the tongue comes between the front top and bottom teeth produce sound of which pair?",
            "How \"Ghunna\" sounds are produced?",
            "How many emission points (makhārij al-ḥurūf) are located in human skeleton/face?",
            "Pair of letters \"ت د ط \" are part of which \"makhārij al-ḥurūf\"?",
            "What will happen if you block/press your nose completely?",
    };
    String[] anwsers ={
            "ن",
            "Shajariyah-Haafiyah",
            "Base of tongue near Uvula",
            "غ خ",
            "ع ح",
            "ص ز س",
            "When noise vibrates while emitting letters",
            "17",
            "Nit-eeyah",
            "None of these",
    };
    String[] options ={"غ خ","ع ح","أ ہ","ت د ط",
            "ن","ج ش ی","ت د ط","غ خ",
            "Base of tongue near Uvula","Portion of tongue near its base touching roof of mouth","Bottom of the tongue","Sides of the tongue",
            "Lahatiyah","Halqiyah", "Shajariyah-Haafiyah", "Ghunna",
            "ف","ر ","ن ","ل ",
            "م ن","ص ز س","ظ  ذ  ث","ت د ط",
            "When inner part of the both lips touch each other", "When Outer part of both lips touch each other" , "When noise vibrates while emitting letters", "None of these",
            "16", "17", "18", "19",
            "Lahatiyah", "Nit-eeyah", "Shajariyah-Haafiyah", "Halqiyah",
            "Shrill sound", "No Sound", "Grave sound" , "None of these"
    };

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