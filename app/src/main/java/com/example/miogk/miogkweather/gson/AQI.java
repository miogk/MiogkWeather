package com.example.miogk.miogkweather.gson;

/**
 * Created by Administrator on 2018/10/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
