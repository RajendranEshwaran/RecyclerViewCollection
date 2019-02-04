package com.example.rajayambigms.recyclerviewstaggeredlayoutexample;

public class StaggeredDataModel {

    private static int drawable;

    public StaggeredDataModel(int _drawable) {
        this.drawable = _drawable;

    }

    public static int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
