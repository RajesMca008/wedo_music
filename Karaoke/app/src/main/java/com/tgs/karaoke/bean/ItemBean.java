package com.tgs.karaoke.bean;

import android.graphics.Bitmap;

/**
 * Created by Vishnu on 08-09-2015.
 */
public class ItemBean {

    String id;
    Bitmap bitMap;
    String str_item;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bitmap getBitMap() {
        return bitMap;
    }

    public void setBitMap(Bitmap bitMap) {
        this.bitMap = bitMap;
    }

    public String getStr_item() {
        return str_item;
    }

    public void setStr_item(String str_item) {
        this.str_item = str_item;
    }
}
