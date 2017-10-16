package com.example.win7.myapplication;

import android.graphics.drawable.Icon;

/**
 * Created by B10706 on 2017-10-16.
 */

class MyItem {
    private int mIcon;
    private String nName;
    private String nCost;


    public MyItem(int mIcon, String nName, String nCost) {
        mIcon = mIcon;
        nName = nName;
        nCost = nCost;
    }

    public String mIcon{
        return mIcon;
    }

    public String nName{
        return nName;
    }

    public String nCost{
        return nCost;
    }
}
