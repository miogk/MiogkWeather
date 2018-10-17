package com.example.miogk.miogkweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/10/15.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        public String txt;
    }

    public class CarWash {
        public String txt;
    }

    public class Sport {
        public String txt;
    }
}