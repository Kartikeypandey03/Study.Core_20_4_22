package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OperatorsJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators_java);
        setupHyperlink1();
        setupHyperlink2();
        setupHyperlink3();
        setupHyperlink4();
        setupHyperlink5();
        setupHyperlink6();
        setupHyperlink7();
        setupHyperlink8();


    }
    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.o1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.o2);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.o3);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink4() {
        TextView linkTextView = findViewById(R.id.o4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink5() {
        TextView linkTextView = findViewById(R.id.o5);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink6() {
        TextView linkTextView = findViewById(R.id.o6);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink7() {
        TextView linkTextView = findViewById(R.id.o7);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink8() {
        TextView linkTextView = findViewById(R.id.operatorlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}