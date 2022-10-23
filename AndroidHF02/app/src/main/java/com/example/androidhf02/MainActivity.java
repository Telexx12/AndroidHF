package com.example.androidhf02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button activityTwoButton = findViewById(R.id.activityTwo);
        activityTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityTwo();
            }
        });

    }

    public void openActivityTwo(){
        Intent intent = new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Main","Restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main","Start");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Main","Stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main","Pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main","Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Main","Destroy");
    }
}