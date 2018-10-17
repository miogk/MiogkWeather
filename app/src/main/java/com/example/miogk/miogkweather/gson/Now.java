package com.example.miogk.miogkweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/10/15.
 */

public class Now {
    public String tmp;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
