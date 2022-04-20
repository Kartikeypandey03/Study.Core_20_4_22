package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EnvironmentSetupjava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment_setupjava);
        setupHyperlink();
    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.environmentlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView linkTextViewroadmap =findViewById(R.id.roadmaplink);
        linkTextViewroadmap.setMovementMethod((LinkMovementMethod.getInstance()));
    }
}