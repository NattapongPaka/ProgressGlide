package com.frank.progressglide.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.target.Target;
import com.frank.progressglide.R;
import com.frank.progressglide.model.ConfigSingleton;
import com.frank.progressglide.progress.ProgressListener;
import com.frank.progressglide.progress.ProgressModelLoader;
import com.pnikosis.materialishprogress.ProgressWheel;

import java.lang.ref.WeakReference;

import timber.log.Timber;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example1 extends AppCompatActivity {


    private ViewStub viewStub;
    private FloatingActionButton floatingActionButton;
    private ImageView imageView;
    private FrameLayout frameLayout;
    private String group_id = "5779efbe42f92e81712bfa83";
    private String finalCreatedate = "0000-00-00T00:00:00";
    private Handler mHandler;
    private FrameLayout frameLayoutProgress;
    private ProgressBar progressBarExample1;
    private ProgressWheel progress_wheel;
    private final MainHandler mainHandler = new MainHandler(this);
    private View view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example1);

        viewStub = (ViewStub) findViewById(R.id.viewStub);
        view = viewStub.inflate();
        imageView = (ImageView) findViewById(R.id.imageViewExample1);

        floatingActionButton = (FloatingActionButton)view. findViewById(R.id.fab);
        progress_wheel = (ProgressWheel)view.findViewById(R.id.progress_wheel);

        ConfigSingleton.getInstantce().setUser_id("571a594c462928c15b8b4569");
        ProgressListener progressListener = new ProgressListener() {
            @Override
            public void update(final long bytesRead, final long contentLength, final boolean done) {
                //int progress = (int) ((100 * bytesRead) / contentLength);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        float progressf = (100 * bytesRead) / contentLength;
                        //progressBarExample1.setProgress(progress);
                        //progress_wheel.setInstantProgress(progressf/100);

                        Timber.d("Progress : %s", String.valueOf(progressf / 100));

                        progress_wheel.setProgress(progressf / 100);
                        if (done) {
                            //progressBarExample1.setProgress(100);
                            viewStub.setVisibility(View.GONE);
                            progress_wheel.setProgress(1.0f);
                            Timber.d("Done loading");
                        }
                    }
                });
            }
        };

        final Target<GlideDrawable> target = Glide.with(this)
                .using(new ProgressModelLoader(progressListener))
                .load("https://cdn.photographylife.com/wp-content/uploads/2014/06/Nikon-D810-Image-Sample-6.jpg")
                .placeholder(ContextCompat.getDrawable(this, R.drawable.appicon))
                .error(ContextCompat.getDrawable(this, R.drawable.ic_error))
                // Disabling cache to see download progress with every app load
                // You may want to enable caching again in production
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imageView);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.clear(target);
            }
        });
    }


//    private void getLoadChat(){
//        Call<JsonChatResponse> call = HttpManager.getInstatance().getService().getLoadChatsThread(ConfigSingleton.getInstantce().getCompany_id(), group_id, finalCreatedate, ConfigSingleton.getInstantce().getUser_id());
//        call.enqueue(new Callback<JsonChatResponse>() {
//            @Override
//            public void onResponse(Call<JsonChatResponse> call, Response<JsonChatResponse> response) {
//                if(response.isSuccessful()){
//                    Gson gson = new GsonBuilder().create();
//                    String result = gson.toJson(response.body());
//                    Timber.d("Success \n%s",result);
//                }else{
//                    Timber.d("Error body \n%s",response.errorBody().toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonChatResponse> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });
//    }


    private static class MainHandler extends Handler {
        private final WeakReference<Example1> mActivity;

        public MainHandler(Example1 activity) {
            mActivity = new WeakReference<Example1>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            final Example1 activity = mActivity.get();
            if (activity != null) {
                switch (msg.what) {
                    case 1:
                        //int bytesRead = msg.arg1;
                        //int contentLength = msg.arg2;
                        int percent = msg.arg1*100/msg.arg2;

                        break;
                    default:
                        break;
                }
            }
        }
    }


}
