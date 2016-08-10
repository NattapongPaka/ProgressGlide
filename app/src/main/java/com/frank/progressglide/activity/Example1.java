package com.frank.progressglide.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.frank.progressglide.R;
import com.frank.progressglide.dao.JsonChatResponse;
import com.frank.progressglide.model.ConfigSingleton;
import com.frank.progressglide.model.manager.HttpManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example1 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private String group_id = "5779efbe42f92e81712bfa83";
    private String finalCreatedate = "0000-00-00T00:00:00";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example1);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ConfigSingleton.getInstantce().setUser_id("571a594c462928c15b8b4569");

        getLoadChat();
    }

    private void getLoadChat(){
        Call<JsonChatResponse> call = HttpManager.getInstatance().getService().getLoadChatsThread(ConfigSingleton.getInstantce().getCompany_id(), group_id, finalCreatedate, ConfigSingleton.getInstantce().getUser_id());
        call.enqueue(new Callback<JsonChatResponse>() {
            @Override
            public void onResponse(Call<JsonChatResponse> call, Response<JsonChatResponse> response) {
                if(response.isSuccessful()){
                    Gson gson = new GsonBuilder().create();
                    String result = gson.toJson(response.body());
                    Timber.d("Success \n %s",result);
                }else{
                    Timber.d("Error body \n %s",response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<JsonChatResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }



}
