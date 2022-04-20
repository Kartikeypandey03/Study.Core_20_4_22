package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class basicSyntax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_syntax);
        setupHyperlink();
    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.basicsyntaxlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}