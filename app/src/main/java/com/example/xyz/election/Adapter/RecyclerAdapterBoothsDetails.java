package com.example.xyz.election.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xyz.election.Activity.BoothsDetails2;
import com.example.xyz.election.R;
import com.example.xyz.election.ViewHolder.RecyclerViewHolder;

/**
 * Created by Prashant Chauhan on 06-Aug-16.
 */
public class RecyclerAdapterBoothsDetails extends RecyclerView.Adapter<RecyclerViewHolder> {

    String[] name = {"Isauli", "Sadar", "Jaisinghpur", "Lambhua",
            "Kadipur", "Kadipur", "Jaisinghpur", "Sadar", "Isauli", "Lambhua"};
    Context context;
    LayoutInflater inflater;

    public RecyclerAdapterBoothsDetails(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list_boothdetails, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            Intent intent = new Intent(context.getApplicationContext(), BoothsDetails2.class);
            context.startActivity(intent);
        }
    };

    @Override
    public int getItemCount() {
        return name.length;
    }
}