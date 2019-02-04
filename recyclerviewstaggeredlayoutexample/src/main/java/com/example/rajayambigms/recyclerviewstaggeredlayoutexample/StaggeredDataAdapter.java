package com.example.rajayambigms.recyclerviewstaggeredlayoutexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StaggeredDataAdapter extends RecyclerView.Adapter<StaggeredDataAdapter.StaggeredDataViewHolder> {

    List<StaggeredDataModel>list;

    public StaggeredDataAdapter(List<StaggeredDataModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public StaggeredDataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.staggered_items_row,viewGroup,false);
        return new StaggeredDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredDataViewHolder staggeredDataView, int i) {

        StaggeredDataModel staggeredDataModel = list.get(i);
        staggeredDataView.imgView.getLayoutParams().height =  getRandomIntInRange(300,300);
        staggeredDataView.imgView.setImageResource(Integer.parseInt(Integer.toString(StaggeredDataModel.getDrawable())));

    }

    private static int getRandomIntInRange(int max, int min){
        Random r = new Random();
        return r.nextInt((max-min)+min)+min;
    }
    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StaggeredDataViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgView;

        public StaggeredDataViewHolder(@NonNull View itemView) {
            super(itemView);


            imgView=(ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
