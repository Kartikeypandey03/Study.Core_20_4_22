package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class OverviewJava extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_java);
        setupHyperlink();
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.overviewlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}