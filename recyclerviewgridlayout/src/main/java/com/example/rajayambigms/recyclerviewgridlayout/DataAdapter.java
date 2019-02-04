package com.example.rajayambigms.recyclerviewgridlayout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewerHolder> {

    private List<DataModel>list;

    public DataAdapter(List<DataModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DataViewerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.person_items_row,viewGroup,false);

        return new DataViewerHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull DataViewerHolder viewHolder, int i) {
        DataModel dataModel = list.get(i);
        viewHolder.nameTxt.setText(dataModel.getName());
        viewHolder.photoImg.setImageResource(Integer.parseInt(Integer.toString(dataModel.getDrawable())));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class DataViewerHolder extends RecyclerView.ViewHolder
    {
        TextView nameTxt;
        ImageView photoImg;


        public DataViewerHolder(@NonNull View itemView) {
            super(itemView);

            nameTxt = (TextView)itemView.findViewById(R.id.nameTxtView);
            photoImg = (ImageView)itemView.findViewById(R.id.photoImgView);
        }
    }
}


