package com.example.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface Api {
    String Base_URL = "https://api.openweathermap.org/data/2.5/";
    // String Base_URL = "https://api.openweathermap.org/data/2.5/weather?";
    String Token = "834c5fc4770d0beb4ac7bf206ded86a1";
    String UNITS = "metric";
    String LANG = "es";

    @GET("weather")
    Call<Result> getActualWeather(@Query("lat") Float latitud, @Query("lon") Float longitud, @Query("appid") String token, @Query("units") String units, @Query("lang") String lang);
}
