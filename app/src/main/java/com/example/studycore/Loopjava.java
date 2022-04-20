package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Loopjava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loopjava);
        setupHyperlink1();
        setupHyperlink2();
        setupHyperlink3();

    }
    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.javaforloop);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.javaforeachloop);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.javawhiledowhile);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}