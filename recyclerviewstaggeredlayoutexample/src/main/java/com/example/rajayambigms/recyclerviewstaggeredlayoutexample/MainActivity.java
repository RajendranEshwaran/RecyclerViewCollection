package com.example.rajayambigms.recyclerviewstaggeredlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<StaggeredDataModel> dataModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private StaggeredDataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView)findViewById(R.id.RecyclerViewStaggered);
        prepareData();

        mAdapter = new StaggeredDataAdapter(dataModelList);
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager( 2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
    public void prepareData()
    {

        StaggeredDataModel dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);
        dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);
        dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);
        dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);
        dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);
        dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);
        dataModel = new StaggeredDataModel(R.drawable.android);
        dataModelList.add(dataModel);

    }

}
