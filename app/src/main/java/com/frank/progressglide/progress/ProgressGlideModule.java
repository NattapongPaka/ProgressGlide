package com.frank.progressglide.progress;


import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.module.GlideModule;

import java.io.File;
import java.io.InputStream;

public class ProgressGlideModule implements GlideModule {

    private int defaultMemoryCacheSize;
    private int defaultBitmapPoolSize;

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        MemorySizeCalculator calculator = new MemorySizeCalculator(context);
        defaultMemoryCacheSize = calculator.getMemoryCacheSize();
        defaultBitmapPoolSize = calculator.getBitmapPoolSize();

        builder.setMemoryCache(new LruResourceCache(defaultMemoryCacheSize));
        builder.setBitmapPool(new LruBitmapPool(defaultBitmapPoolSize));
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        glide.register(String.class, InputStream.class, new ProgressModelLoader.Factory());
    }
}
