package com.sergio.viewpagercel;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ravindu1024.indicatorlib.ViewPagerIndicator;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        ViewPager pager =  findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        ViewPagerIndicator indicator =  findViewById(R.id.pager_indicator);

        indicator.setPager(pager);


    }
}
