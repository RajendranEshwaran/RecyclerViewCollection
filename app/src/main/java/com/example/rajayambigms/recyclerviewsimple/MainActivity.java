package com.example.rajayambigms.recyclerviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<PlayerDetail> playerList = new ArrayList<>();
    private RecyclerView recyclerView;
    private PlayerDetailsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolBar);
//        setActionBar(toolbar);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        mAdapter = new PlayerDetailsAdapter(playerList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareData();
    }

    private void prepareData() {
        PlayerDetail playerDetail = new PlayerDetail("SachinTendulkar",40,"India-Batsman");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("MS Dhoni",35,"India-Batsman/Wickeeper");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Virendar Shewah",40,"India-Batsman");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Rahul Dravid",40,"India-Batsman");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("VVS Laxman",40,"India-Batsman");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Virat Kohli",40,"India-Batsman");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Zaheer Khan",37,"India-Bowler");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Asish Nehra",40,"India-Bowler");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Anil Kumble",42,"India-Bowler");
        playerList.add(playerDetail);

         playerDetail = new PlayerDetail("Yuvraj Sign",40,"India-Allrounder");
        playerList.add(playerDetail);

        mAdapter.notifyDataSetChanged();
    }
}
