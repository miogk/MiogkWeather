package com.example.miogk.miogkweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2018/10/14.
 */

public class County extends LitePalSupport {
    private int id;//字段
    private String countyName;//县的名字
    private String weatherId;//县所对应的天气ID
    private int cityId;//所属市的ID


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
