package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaDecisonMaking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_decison_making);
        setupHyperlink1();
        setupHyperlink2();

    }
    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.javaifelse);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.javaswitch);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}