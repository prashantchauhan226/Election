package com.example.xyz.election.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xyz.election.Adapter.RecyclerAdapterBoothsDetails;
import com.example.xyz.election.Adapter.RecyclerAdapterEroDetails;
import com.example.xyz.election.R;
import com.example.xyz.election.SimpleDividerItemDecoration;

public class BoothsDetails extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booths_details);
        recyclerView = (RecyclerView) findViewById(R.id.booths_details_recycler_view);
        RecyclerAdapterBoothsDetails adapter = new RecyclerAdapterBoothsDetails(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(
                getApplicationContext()
        ));
    }
}