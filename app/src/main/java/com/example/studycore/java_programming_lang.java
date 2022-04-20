package com.example.studycore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class java_programming_lang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_programming_lang);


        TextView overviewJava=findViewById(R.id.overviewJava);
        TextView environmentSetup=findViewById(R.id.environmentSetup);
        TextView basicsyntax=findViewById(R.id.basicsyntax);
        TextView datatypes=findViewById(R.id.datatypes);
        TextView variables=findViewById(R.id.variables);
        TextView operators=findViewById(R.id.Javaopertors);
        TextView loop=findViewById(R.id.javaloop);
        TextView decisonmaking=findViewById(R.id.javadecisonmaking);
        TextView numbers=findViewById(R.id.javanumbers);
        TextView characters=findViewById(R.id.javacharacters);
        TextView strings=findViewById(R.id.Stringjava);
        TextView arrays=findViewById(R.id.javaarrays);

        overviewJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(java_programming_lang.this, OverviewJava.class);
                startActivity(intent);
            }
        });
        environmentSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,EnvironmentSetupjava.class);
                startActivity(intent);
            }
        });
        basicsyntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,basicSyntax.class);
                startActivity(intent);
            }
        });
        datatypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,datatypesjava.class);
                startActivity(intent);
            }
        });
        variables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,VariableJava.class);
                startActivity(intent);
            }
        });
        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,OperatorsJava.class);
                startActivity(intent);
            }
        });
      loop.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(java_programming_lang.this,Loopjava.class);
              startActivity(intent);
          }
      });
      decisonmaking.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(java_programming_lang.this,JavaDecisonMaking.class);
              startActivity(intent);
          }
      });
      numbers.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(java_programming_lang.this,Javanumbers.class);
              startActivity(intent);
          }
      });
        strings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,JavaStrings.class);
                startActivity(intent);
            }
        });
        arrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,JavaArray.class);
                startActivity(intent);
            }
        });
        characters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(java_programming_lang.this,Javacharacters.class);
                startActivity(intent);
            }
        });
    }
}