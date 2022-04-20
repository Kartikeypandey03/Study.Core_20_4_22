package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaArray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_array);
        setupHyperlink();

    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.javaarray);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}