package com.example.faustocheca.madrid2030;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    TextView textViewName;
    TextView textViewActivity;
    TextView textViewZone;


    Producto producto;

    Toolbar toolbar;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = (Toolbar) findViewById(R.id.toolbar_detail);
        setupToolbar();


        // Binding



        textViewName = (TextView) findViewById(R.id.tv_detail_name);
        textViewActivity = (TextView) findViewById(R.id.tv_detail_activity);
        textViewZone = (TextView) findViewById(R.id.tv_detail_zone);



        //  Recoger el Producto que se va a presentar /////////////


        Intent intent = getIntent();
        Producto producto = (Producto) intent.getParcelableExtra("producto");






    // no influye en la posición que ocupa cada uno

        textViewName.setText(producto.getName());
        textViewActivity.setText(producto.getDescription());
        textViewZone.setText(producto.getPrice());




    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                super.onBackPressed();
                break;

        }
        return super.onOptionsItemSelected(item);
    }






    }

