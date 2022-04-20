package com.example.studycore;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuantitativeAptitudeSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantitative_aptitude_section);
setupHyperlink1();
setupHyperlink2();
setupHyperlink3();
setupHyperlink4();
setupHyperlink5();
setupHyperlink6();
setupHyperlink7();
setupHyperlink8();
setupHyperlink9();
setupHyperlink10();
setupHyperlink11();
setupHyperlink12();
setupHyperlink13();
setupHyperlink14();
setupHyperlink15();


    }
    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.numberslink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.timeandworklink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.timeanddistancelink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink4() {
        TextView linkTextView = findViewById(R.id.profitlosslink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink5() {
        TextView linkTextView = findViewById(R.id.averagelink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink6() {
        TextView linkTextView = findViewById(R.id.permutationcombinationlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink7() {
        TextView linkTextView = findViewById(R.id.ratioproportionlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink8() {
        TextView linkTextView = findViewById(R.id.simpleinterestlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink9() {
        TextView linkTextView = findViewById(R.id.hcflcmlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink10() {
        TextView linkTextView = findViewById(R.id.pipeslink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink11() {
        TextView linkTextView = findViewById(R.id.ageslink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink12() {
        TextView linkTextView = findViewById(R.id.percentlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink13() {
        TextView linkTextView = findViewById(R.id.probabilitylink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink14() {
        TextView linkTextView = findViewById(R.id.quantlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void setupHyperlink15() {
        TextView linkTextView = findViewById(R.id.testbooklink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }


}