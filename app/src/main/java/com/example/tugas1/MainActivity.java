package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvIdol;
    private ArrayList<Idol> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rvIdol = findViewById(R.id.rv_idol);
        rvIdol.setHasFixedSize(true);
        
        list.addAll(IdolData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvIdol.setLayoutManager(new LinearLayoutManager(this));
        ListIdolAdapter listIdolAdapter = new ListIdolAdapter(list);
        rvIdol.setAdapter(listIdolAdapter);
    }
}
