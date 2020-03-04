package com.something.android.stories3.Model;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by MOHAMED on 01/07/2018.
 */

public class Story implements Serializable {

    private int mType;



    private String mTitle;
    private String mDescription;
    private int mImg;


    public Story(String mTitle, String mDescription, int mImg) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mImg = mImg;
    }

    public int getmType() {
        return mType;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImg() {
        return mImg;
    }
}
