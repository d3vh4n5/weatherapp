package com.example.weatherapp;

import java.util.*;
import com.google.gson.annotations.SerializedName;
public class Result {
    @SerializedName("name")
    public String name;

    @SerializedName("weather")
    public ArrayList<Weather> weather = null;

    @SerializedName("main")
    public Main main = null;

    @SerializedName("visibility")
    public Integer visibility;


    public class Weather {
        @SerializedName("description")
        public String description;
    }

    public class Main {
        @SerializedName("temp")
        public Float temp;

        @SerializedName("temp_max")
        public Float temp_max;

        @SerializedName("temp_min")
        public Float temp_min;
    }

    // Metodo constructor de la clase Constructor
    public Result(String name, ArrayList<Weather> weather, Main main, Integer visibility) {
        this.name = name;
        this.weather = weather;
        this.main = main;
        this.visibility = visibility;
    }

}