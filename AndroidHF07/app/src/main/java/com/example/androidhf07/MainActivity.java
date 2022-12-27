package com.example.androidhf07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<allat> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        setUpList();

        allat_RecyclerViewAdapter adapter = new allat_RecyclerViewAdapter(this,mList);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
    }

    protected void setUpList(){
        mList.add(new allat(R.drawable.cat,"Macska", "miau miau"));
        mList.add(new allat(R.drawable.disznyo,"Disznyo", "roff roff"));
    }
}