package com.example.studycore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CardView javaprogrammingcard = findViewById(R.id.javaprogrammingcard);
        javaprogrammingcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, java_programming_lang.class);
                startActivity(intent);
            }
        });

        CardView competitivecodingcard = findViewById(R.id.competitivecodingcard);
        competitivecodingcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, CompetitiveCodingSection.class);
                startActivity(intent);
            }

        });

        CardView AptitudeSectionCard=findViewById(R.id.AptitudeSectionCard);
        AptitudeSectionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,AptitudeSection.class);
                startActivity(intent);
            }
        });


        CardView Interviewsectioncard=findViewById(R.id.Interviewsectioncard);
        Interviewsectioncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,InterviewPreparationSection.class);
                startActivity(intent);
            }
        });



        CardView ebookcard=findViewById(R.id.ebookcard);
        ebookcard.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity2.this,EbookSection.class);
            startActivity(intent);
        });


    }
}