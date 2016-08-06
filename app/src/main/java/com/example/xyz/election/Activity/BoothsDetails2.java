package com.example.xyz.election.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xyz.election.Adapter.RecyclerAdapterBoothsDetails;
import com.example.xyz.election.Adapter.RecyclerAdapterBoothsDetails2;
import com.example.xyz.election.R;
import com.example.xyz.election.SimpleDividerItemDecoration;

public class BoothsDetails2 extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booth_details2);
        recyclerView = (RecyclerView) findViewById(R.id.booths_details2_recycler_view);
        RecyclerAdapterBoothsDetails2 adapter = new RecyclerAdapterBoothsDetails2(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(
                getApplicationContext()
        ));
    }
}