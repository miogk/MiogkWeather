package com.example.miogk.miogkweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2018/10/14.
 */

public class City extends LitePalSupport {
    private int id;//字段
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//所属省的代号


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}