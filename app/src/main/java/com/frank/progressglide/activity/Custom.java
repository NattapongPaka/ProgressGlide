package com.frank.progressglide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.frank.progressglide.R;
import com.frank.progressglide.progress.ProgressListener;
import com.frank.progressglide.progress.ProgressModelLoader;
import com.pnikosis.materialishprogress.ProgressWheel;

import okhttp3.OkHttpClient;

/**
 * Created by Noth on 9/8/2559.
 */

/*
   For more information see:
   https://github.com/square/okhttp/blob/master/samples/guide/src/main/java/com/squareup/okhttp/recipes/Progress.java
*/

public class Custom extends AppCompatActivity{
    private static final String LOG_TAG = "MainActivity";

    private final static String DOWNLOAD_URL = "https://cdn.photographylife.com/wp-content/uploads/2014/06/Nikon-D810-Image-Sample-6.jpg";

    private OkHttpClient.Builder mOkHttpClient;
    private ImageView image;
    private ProgressBar progressBar;
    private TextView progressTextView;
    private ProgressWheel progressWheel;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        progressWheel = new ProgressWheel(this);
//        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
//        image = (ImageView) findViewById(R.id.iv_0);
//        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
//        progressTextView = (TextView) findViewById(R.id.progress_text_view);

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
        frameLayout.addView(progressWheel, layoutParams);

        mOkHttpClient = new OkHttpClient().newBuilder();
        mOkHttpClient.followRedirects(true);
        mOkHttpClient.followSslRedirects(true);

        final ProgressListener progressListener = new ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
                int progress = (int) ((100 * bytesRead) / contentLength);

                // Enable if you want to see the progress with logcat
                // Log.v(LOG_TAG, "Progress: " + progress + "%");
                progressBar.setProgress(progress);
                //progressTextView.setText(String.valueOf(progress));
                Log.d(LOG_TAG,"Progress : "+String.valueOf(progress));
                if (done) {
                    Log.i(LOG_TAG, "Done loading");
                }
            }
        };

//        mOkHttpClient.networkInterceptors().add(new Interceptor() {
//            @Override
//            public Response intercept(Interceptor.Chain chain) throws IOException {
//                Response originalResponse = chain.proceed(chain.request());
//                return originalResponse.newBuilder()
//                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
//                        .build();
//            }
//        });

        //Glide.get(this).register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(mOkHttpClient.build()));

        Glide.with(this)
                .using(new ProgressModelLoader(progressListener))
                .load(DOWNLOAD_URL)
                // Disabling cache to see download progress with every app load
                // You may want to enable caching again in production
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(image);
    }

//    private static class ProgressResponseBody extends ResponseBody {
//
//        private final ResponseBody responseBody;
//        private final ProgressListener progressListener;
//        private BufferedSource bufferedSource;
//
//        public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
//            this.responseBody = responseBody;
//            this.progressListener = progressListener;
//        }
//
//        @Override
//        public MediaType contentType() {
//            return responseBody.contentType();
//        }
//
//        @Override
//        public long contentLength() {
//            return responseBody.contentLength();
//        }
//
//        @Override
//        public BufferedSource source() {
//            if (bufferedSource == null) {
//                bufferedSource = Okio.buffer(source(responseBody.source()));
//            }
//            return bufferedSource;
//        }
//
//        private Source source(Source source) {
//            return new ForwardingSource(source) {
//                long totalBytesRead = 0L;
//
//                @Override
//                public long read(Buffer sink, long byteCount) throws IOException {
//                    long bytesRead = super.read(sink, byteCount);
//                    // read() returns the number of bytes read, or -1 if this source is exhausted.
//                    totalBytesRead += bytesRead != -1 ? bytesRead : 0;
//                    progressListener.update(totalBytesRead, responseBody.contentLength(), bytesRead == -1);
//                    Log.d(LOG_TAG,"TotalBytesRead : "+String.valueOf(totalBytesRead));
//                    return bytesRead;
//                }
//            };
//        }
//    }

//    public static interface ProgressListener {
//        void update(long bytesRead, long contentLength, boolean done);
//    }
}
