package com.frank.progressglide.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.frank.progressglide.Example2ViewAdapter;
import com.frank.progressglide.R;
import com.frank.progressglide.model.example2Model;

import java.util.ArrayList;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example2 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private int ITEM_MAX = 20;
    private ArrayList<example2Model> example2ModelArrayList = new ArrayList<>();
    private String[] mStringsLink = new String[]{
            "http://www.noaanews.noaa.gov/stories/images/goes-12%2Dfirstimage-large081701%2Ejpg",
            "http://www.spektyr.com/PrintImages/Cerulean%20Cross%203%20Large.jpg",
            "https://cdn.photographylife.com/wp-content/uploads/2014/06/Nikon-D810-Image-Sample-6.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/5/5b/Ultraviolet_image_of_the_Cygnus_Loop_Nebula_crop.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/c/c5/Polarlicht_2_kmeans_16_large.png",
            "https://www.hq.nasa.gov/alsj/a15/M1123519889LCRC_isometric_min-8000_g0dot5_enhanced_labeled.jpg",
            "http://oceanexplorer.noaa.gov/explorations/02fire/logs/hirez/octopus_hires.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/bf/GOES-13_First_Image_jun_22_2006_1730Z.jpg",
            "http://www.zastavki.com/pictures/originals/2013/Photoshop_Image_of_the_horse_053857_.jpg",
            "http://www.marcogiordanotd.com/blog/wp-content/uploads/2014/01/image9Kcomp.jpg",
            "https://cdn.photographylife.com/wp-content/uploads/2014/06/Nikon-D810-Image-Sample-7.jpg",
            "https://www.apple.com/v/imac-with-retina/a/images/overview/5k_image.jpg",
            "https://www.gimp.org/tutorials/Lite_Quickies/lordofrings_hst_big.jpg",
            "http://www.cesbio.ups-tlse.fr/multitemp/wp-content/uploads/2015/07/Mad%C3%A8re-022_0_1.jpg",
            "https://www.spacetelescope.org/static/archives/fitsimages/large/slawomir_lipinski_04.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/b4/Mardin_1350660_1350692_33_images.jpg",
            "http://4k.com/wp-content/uploads/2014/06/4k-image-tiger-jumping.jpg"
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example2_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewExample2_Main);
        for (int i = 0; i < mStringsLink.length; i++) {
            example2Model model = new example2Model(String.valueOf(i), mStringsLink[i], "Pic_" + String.valueOf(i));
            example2ModelArrayList.add(model);
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new Example2ViewAdapter(this, example2ModelArrayList));
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter mIntentFilter = new IntentFilter();
        mIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        mIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        registerReceiver(mBroadcastReceiver, mIntentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mBroadcastReceiver);
    }

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            final android.net.NetworkInfo wifi = connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            final android.net.NetworkInfo mobile = connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if (wifi.isAvailable() || mobile.isAvailable()) {
                // Do something
                Log.d("Network Available ", "Flag No 1");
            }

            Log.d(Example2.class.getSimpleName(), "Is online : " + String.valueOf(isOnline(Example2.this)));
        }
    };

    public boolean isOnline(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        //should check null because in airplane mode it will be null
        return (netInfo != null && netInfo.isConnected());
    }

}
