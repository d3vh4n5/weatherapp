package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList ciudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setUpListView();
    }

    void setUpListView() {
        listView = (ListView) findViewById(R.id.miListView);
        ciudades = new ArrayList<String>();
        ciudades.add("Campana");
        ciudades.add("Zarate");
        ciudades.add("Escobar");
        ciudades.add("Bahía Blanca");
        ciudades.add("Tigre");

        /*
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, ciudades);

        listView.setAdapter(arrayAdapter);

         */
        CustomAdapter adapter = new CustomAdapter(this, ciudades);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                irDetalle((String) ciudades.get(position));
            }
        });
    }

    private void irDetalle(String ciudad){
        Intent myIntent = new Intent(this, DetailActivity.class);
        myIntent.putExtra("nombreCiudad", ciudad);
        startActivity(myIntent);

    }


}