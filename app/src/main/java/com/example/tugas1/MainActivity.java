package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode List";
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

        listIdolAdapter.setOnItemClickCallback(new ListIdolAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Idol data){
                showSelectedIdol(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.about_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.about:
                break;
        }
    }

    public void handleAbout(MenuItem item) {
        Intent intent =  new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void showSelectedIdol(Idol idol){
        Toast.makeText(this,"Kamu memilih " + idol.getName(), Toast.LENGTH_SHORT).show();
    }
}
