package com.example.andoridhf01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button plus = findViewById(R.id.button);
        Button minus = findViewById(R.id.button2);
        Button multiplication = findViewById(R.id.button3);
        Button division = findViewById(R.id.button4);
        plus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                szamol("plus");
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                szamol("minus");

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                szamol("multiplication");
            }
        });
        division.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                szamol("division");
            }
        });

    }

    public void szamol(String muvelet){
        TextView text = findViewById(R.id.textView);

        try {
            EditText editText = findViewById(R.id.editTextNumber);
            double szam1 = Double.parseDouble(editText.getText().toString());
            EditText editText1 = findViewById(R.id.editTextNumber2);
            double szam2 = Double.parseDouble(editText1.getText().toString());



        switch (muvelet){
            case "plus":
                text.setText(String.valueOf(szam1+szam2));
                break;
            case "minus":
                text.setText(String.valueOf(szam1-szam2));
                break;
            case "multiplication":
                text.setText(String.valueOf(szam1*szam2));
                break;
            case "division":
                text.setText(String.valueOf(szam1/szam2));
                break;

        }
        }catch (Exception e){
            text.setText(e.getMessage());
        }
    }


}