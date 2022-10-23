package com.example.androidhf02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button startMainActivityButton = findViewById(R.id.startMainActivity);
        startMainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityThree();
            }
        });
    }
    public void openActivityThree(){
        Intent intent = new Intent(this,ActivityThree.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityTwo","Restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityTwo","Start");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityTwo","Stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityTwo","Pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityTwo","Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityTwo","Destroy");
    }
}