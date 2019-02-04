package com.example.rajayambigms.recyclerviewgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataModel> dataModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.RecyclerViewGridLayout);
        prepareData();

        mAdapter = new DataAdapter(dataModelList);
       // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }

    public void prepareData()
    {

        DataModel dataModel = new DataModel("Abdul Kalam",R.drawable.abdulkalam);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Bill Gates",R.drawable.bilgates);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Bruce Lee",R.drawable.brucelee);
        dataModelList.add(dataModel);

        dataModel = new DataModel("MS Dhoni",R.drawable.dhoni);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Donald Trump",R.drawable.donaldtrump);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Ghandiji",R.drawable.ghandiji);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Hitler",R.drawable.hitler);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Michel Jackson",R.drawable.jackson);
        dataModelList.add(dataModel);

        dataModel = new DataModel("God Jesus",R.drawable.jesus);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Mark Zuakeberg",R.drawable.mark);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Ricky Ponting",R.drawable.ponting);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Beautiful Girl",R.drawable.richgirl);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Sachin Tendulkar",R.drawable.sachin);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Steve Jobs",R.drawable.stevejobs);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Mother Teresa",R.drawable.teresa);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Tom Cruse",R.drawable.tomcruse);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Virat Kholi",R.drawable.viratkohli);
        dataModelList.add(dataModel);

        dataModel = new DataModel("Warren Buffet",R.drawable.warrenbuffet);
        dataModelList.add(dataModel);



    }

}
