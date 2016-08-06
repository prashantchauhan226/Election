package com.example.xyz.election.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xyz.election.Adapter.RecyclerAdapterEroDetails;
import com.example.xyz.election.R;

public class EroDetails extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ero_details);
        recyclerView= (RecyclerView) findViewById(R.id.ero_details_recycler_view);

        RecyclerAdapterEroDetails adapter=new RecyclerAdapterEroDetails(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}