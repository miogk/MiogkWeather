package com.example.miogk.miogkweather.gson;

import java.util.List;

/**
 * Created by Administrator on 2018/10/15.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    public List<Forecast> forecastList;
}
