package com.example.studycore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AptitudeSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_section);
        CardView quantitativeaptitudecard=findViewById(R.id.quantitativeaptitudecard);
        quantitativeaptitudecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AptitudeSection.this, QuantitativeAptitudeSection.class);
                startActivity(intent);
            }

        });
        CardView qualitativesectioncard=findViewById(R.id.qualitativesectioncard);
        qualitativesectioncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AptitudeSection.this, Qualitativeaptitudesection.class);
                startActivity(intent);
            }

        });
    }
}