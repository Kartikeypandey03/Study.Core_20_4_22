package com.example.studycore;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EbookSection extends AppCompatActivity {

    EditText editText;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook_section);
        editText = findViewById(R.id.editText);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String term1=" pdfdrive";
                String term = editText.getText().toString();
                intent.putExtra(SearchManager.QUERY, term+term1);
                startActivity(intent);
            }
        });
    }
}