package com.example.xyz.election.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.xyz.election.R;

/**
 * Created by Prashant Chauhan on 06-Aug-16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView tv1;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        tv1= (TextView) itemView.findViewById(R.id.list_title);

    }
}