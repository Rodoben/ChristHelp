package com.example.christhelp;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DashBoard extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.audienter, R.drawable.puc,
            R.drawable.centalblock,R.drawable.block2
            ,R.drawable.block1,R.drawable.audienter};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();

        init();

    }
    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(DashBoard.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }


    public void redirectNearest(View v) {
        Toast.makeText(this, "Redirected to Nearest Page", Toast.LENGTH_SHORT).show();
    /*    Intent intent = new Intent(this, ListDisplayActivity.class);
        intent.putExtra("MODE", "NEAREST");
        startActivity(intent);
        mDemoSliderPopular.stopAutoCycle();*/
    }

    public void redirectPopular(View v) {
        Toast.makeText(this, "Redirected to Popular Page", Toast.LENGTH_SHORT).show();
      Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("MODE", "POPULAR");
        startActivity(intent);

    }

    public void redirectTrails(View v) {
        Toast.makeText(this, "Redirected to Trails Page", Toast.LENGTH_SHORT).show();
     /*   Intent intent = new Intent(this, ListDisplayActivity.class);
        intent.putExtra("MODE", "TRAIL");
        startActivity(intent);
        mDemoSliderPopular.stopAutoCycle();*/
    }

    public void redirectFavourites(View v) {
       /* Intent intent = new Intent(this, ListDisplayActivity.class);
        intent.putExtra("MODE", "FAVOURITES");
        startActivity(intent);
        mDemoSliderPopular.stopAutoCycle();*/
    }


    }



