package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaStrings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_strings);
        setupHyperlink();

    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.javastring);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}