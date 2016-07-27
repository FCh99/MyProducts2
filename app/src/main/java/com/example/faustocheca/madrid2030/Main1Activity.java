package com.example.faustocheca.madrid2030;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class Main1Activity extends AppCompatActivity {

    ArrayList<Producto> locales;
    Toolbar toolbar;

    Context context;
    Button button_start;



    // ONCREATE    //////////////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_main);
        button_start = (Button) findViewById(R.id.button_start);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);


        locales = new ArrayList<>();

        locales.add(new Producto("Samsung Galaxy", "Teléfono avanzado", "400"));
        locales.add(new Producto("LG Leon", "Teléfono intermedio", "150"));
        locales.add(new Producto("ZTE Blade", "Teléfono avanzado", "200"));
        locales.add(new Producto("BQ Aquarius", "Teléfono intermedio", "250"));
        locales.add(new Producto("Apple Iphone", "Teléfono avanzado", "700"));
        locales.add(new Producto("Samsung Galaxy2", "Teléfono avanzado", "400"));
        locales.add(new Producto("LG Leon2", "Teléfono intermedio", "150"));
        locales.add(new Producto("ZTE Blade2", "Teléfono avanzado", "200"));
        locales.add(new Producto("BQ Aquarius2", "Teléfono intermedio", "250"));
        locales.add(new Producto("Apple Iphone2", "Teléfono avanzado", "700"));





        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putParcelableArrayListExtra("MisLocales", locales);
                startActivity(intent);

            }
        });


    }



}
