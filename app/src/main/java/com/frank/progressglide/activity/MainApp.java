package com.frank.progressglide.activity;

import android.app.Application;


import com.frank.progressglide.BuildConfig;

import timber.log.Timber;

/**
 * Created by Noth on 10/8/2559.
 */

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // แสดง Log เฉพาะ Debug Mode
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
