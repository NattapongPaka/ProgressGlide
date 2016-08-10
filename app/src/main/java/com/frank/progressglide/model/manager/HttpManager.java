package com.frank.progressglide.model.manager;

import com.frank.progressglide.model.ConfigSingleton;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Noth on 10/8/2559.
 */

public class HttpManager {
    private static HttpManager instatance;

    public static HttpManager getInstatance() {
        if (instatance == null)
            instatance = new HttpManager();
        return instatance;
    }

    private ApiService service;
    private Retrofit retrofit;

    private HttpManager() {

        OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder();
        httpClient.followSslRedirects(true);
        httpClient.followRedirects(true);

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);  // <-- this is the important line!

        retrofit = new Retrofit.Builder()
                .baseUrl("http://54.179.157.104/api/public/")
                .addConverterFactory(new ToStringConverterFactory())    //Converter to string
                .addConverterFactory(GsonConverterFactory.create())     //Converter to gson
                .build();
        service = retrofit.create(ApiService.class);
    }


    public ApiService getService() {
        return service;
    }
}

