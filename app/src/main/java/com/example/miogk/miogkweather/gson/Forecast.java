package com.example.miogk.miogkweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/10/15.
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public Temperature temperature;
    @SerializedName("tmp")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        public String txt_d;
    }
}
