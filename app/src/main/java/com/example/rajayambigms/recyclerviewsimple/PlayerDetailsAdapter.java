package com.example.rajayambigms.recyclerviewsimple;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class PlayerDetailsAdapter extends RecyclerView.Adapter<PlayerDetailsAdapter.PlayerViewHolder> {

private List<PlayerDetail>list;

    public PlayerDetailsAdapter(List<PlayerDetail> playerList) {
            this.list = playerList;
    }


    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_row_items,viewGroup,false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder playerViewHolder, int i) {

        PlayerDetail playerDetail = list.get(i);
        playerViewHolder.playerName.setText(playerDetail.getPlayerName());
        playerViewHolder.playerAge.setText(Integer.toString(playerDetail.getPlayerAge()));
        playerViewHolder.playerOccupation.setText(playerDetail.getPlayerOccupation());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder
    {
        public TextView playerName,playerAge,playerOccupation;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);

            playerName = (TextView) itemView.findViewById(R.id.textViewName);
            playerAge = (TextView)itemView.findViewById(R.id.textViewAge);
            playerOccupation = (TextView)itemView.findViewById(R.id.textViewOccu);

        }
    }
}
