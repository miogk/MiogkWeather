package com.example.miogk.miogkweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2018/10/14.
 */

public class Province extends LitePalSupport {
    private int id;//字段
    private String proviceName;//省的名字
    private int proviceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}