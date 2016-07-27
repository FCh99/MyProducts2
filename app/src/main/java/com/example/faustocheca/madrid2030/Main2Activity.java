package com.example.faustocheca.madrid2030;

import android.content.Intent;
import android.os.Bundle;
//import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity {



    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;

    ArrayList<Producto> productos = new ArrayList<>();








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        //Binding
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        Intent intent = getIntent();
        productos = intent.getParcelableArrayListExtra("MisLocales");


            setupViewPager();
            setupTabs();
            setupToolbar();

    }



    private void setupViewPager() {






        ArrayList<Fragment> fragments = new ArrayList<>();

        Fragment1 fragment1 = new Fragment1().newInstance(productos);
        fragments.add(fragment1);

        Fragment2 fragment2 = new Fragment2("COMING SOON ¡¡");
        fragments.add(fragment2);




        //a mostrar por el view pager

        ArrayList<String> titles = new ArrayList<>();
        titles.add("PRODUCTOS");
        titles.add("HISTORICO");

        TabFragmentViewpagerAdapter adapter= new TabFragmentViewpagerAdapter
                (getSupportFragmentManager(),fragments,titles);
        viewPager.setAdapter(adapter);


    }


    private void setupToolbar() {
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:
                super.onBackPressed();
                break;

        }
        return super.onOptionsItemSelected(item);
    }




    private void setupTabs() {
        tabLayout.setupWithViewPager(viewPager);





        int px = Helper.dpToPx(this, 16);
        tabLayout.setSelectedTabIndicatorHeight(px);


    }



    public ArrayList<Producto> getMyArrayLocals () {
        return productos;
    }




}
