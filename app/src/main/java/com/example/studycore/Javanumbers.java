package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Javanumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javanumbers);
        setupHyperlink();

    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.javanumbers);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}