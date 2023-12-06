package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = findViewById(R.id.welcomeText);
        Button currentForecastButton = findViewById(R.id.currentForecastButton);
        Button cityListButton = findViewById(R.id.cityListButton);


        welcomeText.setText(getString(R.string.welcome_message));
        currentForecastButton.setText(getString(R.string.current_forecast));
        cityListButton.setText(getString(R.string.city_list));
    }

    public void listarCiudades(View view){
        Intent miIntent = new Intent(this, ListActivity.class);
        startActivity(miIntent);
    }

    public void irDetalle(View view){
        Intent myIntent = new Intent(this, DetailActivity.class);
        //myIntent.putExtra("nombreCiudad", "Campana");

        // En la api 4 ponemos:
        myIntent.putExtra("lat", -34.1633f);
        myIntent.putExtra("lon", -58.9592f);
        startActivity(myIntent);
    }
}