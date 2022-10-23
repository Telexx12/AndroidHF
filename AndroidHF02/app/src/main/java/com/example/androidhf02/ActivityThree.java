package com.example.androidhf02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityThree","Restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityThree","Start");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityThree","Stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityThree","Pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityThree","Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityThree","Destroy");
    }
}