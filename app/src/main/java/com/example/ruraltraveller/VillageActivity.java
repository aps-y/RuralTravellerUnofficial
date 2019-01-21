package com.example.ruraltraveller;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

public class VillageActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village);

          toolbar = findViewById(R.id.VillageToolbar);
          setSupportActionBar(toolbar);


       PgrAdapter pgrAdapter = new PgrAdapter(getSupportFragmentManager());
       ViewPager viewPager = findViewById(R.id.VillagePager);
       viewPager.setAdapter(pgrAdapter);

       TabLayout tabLayout = findViewById(R.id.VillageTabs);
       tabLayout.setTabsFromPagerAdapter(pgrAdapter);

    }
}
