package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //@SerializedName 注释的方式来让JSON字段和Java 字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
