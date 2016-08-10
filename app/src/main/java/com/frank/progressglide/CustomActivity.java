//package com.frank.progressglide;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.widget.ImageView;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import com.bumptech.glide.Glide;
//import com.bumptech.glide.Priority;
//import com.bumptech.glide.load.data.DataFetcher;
//import com.bumptech.glide.load.model.GlideUrl;
//import com.bumptech.glide.load.model.stream.StreamModelLoader;
//import com.bumptech.glide.util.ContentLengthInputStream;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import okhttp3.HttpUrl;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import okhttp3.ResponseBody;
//
///**
// * Created by Noth on 9/8/2559.
// */
//
//public class CustomActivity extends AppCompatActivity {
//
//    private ProgressBar progressBar;
//    private TextView progressTextView;
//    private ImageView image;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        image = (ImageView) findViewById(R.id.iv_0);
//        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
//        progressTextView = (TextView) findViewById(R.id.progress_text_view);
//
////        Glide.with(this)
////
////                .load("http://www.noaanews.noaa.gov/stories/images/goes-12%2Dfirstimage-large081701.jpg")
////                .into(image);
//
//
//            Glide.with(this)
//                    .using(new GlideOkHttpUrlProgressLoader(progressListener))
//                    .load(new GlideUrl("http://www.noaanews.noaa.gov/stories/images/goes-12%2Dfirstimage-large081701.jpg"))
//                    .into(image);
//                //.load("http://www.noaanews.noaa.gov/stories/images/goes-12%2Dfirstimage-large081701.jpg")
//
//                //.into(image);
//    }
//
////    @Override
////    public void onProgress(long bytesRead, long expectedLength) {
////        int progress = (int)(100 * bytesRead / expectedLength);
////        progressBar.setIndeterminate(false);
////        progressBar.setProgress(progress);
////        image.setImageLevel((int)(10000 * bytesRead / expectedLength));
////        progressTextView.setText(
////                String.format("downloading %.2f/%.2f MB %.1f%%",
////                bytesRead / 1e6, expectedLength / 1e6, 100f * bytesRead / expectedLength));
////        Log.d(CustomActivity.class.getSimpleName(),"Progress : "+String.valueOf(progress));
////    }
////
////    @Override
////    public float getGranualityPercentage() {
////        return 0;
////    }
//
////    IProgressListener  progressListener  = new IProgressListener () {
////        @Override
////        public final void update(long bytesReadOrWrite,
////                                 long contentLength,
////                                 boolean done,
////                                 Request originalRequest,
////                                 Request wrappedRequest,
////                                 Response originalResponse,
////                                 Response wrappedResponse) {
////            // TODO:  show progress
////        }
////    };
////  public interface IProgressListener progressListener;
//
//    interface IProgressListener{
//        void update(long bytesReadOrWrite,
//                    long contentLength,
//                    boolean done,
//                    Request originalRequest,
//                    Request wrappedRequest,
//                    Response originalResponse,
//                    Response wrappedResponse);
//    }
//
//    IProgressListener progressListener = new IProgressListener() {
//        @Override
//        public void update(long bytesRead, long expectedLength, boolean done, Request originalRequest, Request wrappedRequest, Response originalResponse, Response wrappedResponse) {
//            int progress = (int)(100 * bytesRead / expectedLength);
//            progressBar.setIndeterminate(false);
//            progressBar.setProgress(progress);
//            image.setImageLevel((int)(10000 * bytesRead / expectedLength));
//            progressTextView.setText(
//                    String.format("downloading %.2f/%.2f MB %.1f%%",
//                    bytesRead / 1e6, expectedLength / 1e6, 100f * bytesRead / expectedLength));
//            Log.d(CustomActivity.class.getSimpleName(),"Progress : "+String.valueOf(progress));
//        }
//    };
//
//    public class GlideOkHttpUrlProgressLoader implements StreamModelLoader<GlideUrl> {
//        private final OkHttpClient mClient;
//
//        public GlideOkHttpUrlProgressLoader(final IProgressListener listener) {
//            mClient = new OkHttpClient.Builder()
//                    .connectTimeout(1000, TimeUnit.MINUTES)
//                    .readTimeout(1000, TimeUnit.MINUTES)
//                    .writeTimeout(1000, TimeUnit.MINUTES)
//                    .build();
//        }
//
//        @Override
//        public DataFetcher<InputStream> getResourceFetcher(GlideUrl model, int width, int height) {
//            return new GlideOkHttpStreamFetcher(mClient, model);
//        }
//    }
//
//    public class GlideOkHttpStreamFetcher implements DataFetcher<InputStream> {
//        private static final String TAG = "GlideOkHttpStreamFetcher";
//
//        private final OkHttpClient client;
//        private final GlideUrl url;
//        private InputStream stream;
//        private ResponseBody responseBody;
//
//        public GlideOkHttpStreamFetcher(OkHttpClient client, GlideUrl url) {
//            this.client = client;
//            this.url = url;
//        }
//
//        @Override
//        public InputStream loadData(Priority priority) throws Exception {
//            HttpUrl parsed = HttpUrl.parse(url.toStringUrl());
//            if (parsed == null) {
//                String errorMsg = "unexpected url: " + String.valueOf(url.toStringUrl());
//                //Log.e(TAG, errorMsg);
//                throw new IllegalArgumentException(errorMsg);
//            }
//
//            Request.Builder requestBuilder = new Request.Builder()
//                    .url(url.toStringUrl());
//
//            for (Map.Entry<String, String> headerEntry : url.getHeaders().entrySet()) {
//                String key = headerEntry.getKey();
//                requestBuilder.addHeader(key, headerEntry.getValue());
//            }
//
//            Request request = requestBuilder.build();
//
//            Response response = client.newCall(request).execute();
//            responseBody = response.body();
//            if (!response.isSuccessful()) {
//                String errorMsg = "Request failed with code: " + response.code();
//                //Log.e(TAG, errorMsg);
//                throw new IOException(errorMsg);
//            }
//
//            long contentLength = responseBody.contentLength();
//            stream = ContentLengthInputStream.obtain(responseBody.byteStream(), contentLength);
//            return stream;
//        }
//
//        @Override
//        public void cleanup() {
//            if (stream != null) {
//                try {
//                    stream.close();
//                } catch (IOException e) {
//                    // Ignored
//                }
//            }
//            if (responseBody != null) {
//                responseBody.close();
//            }
//        }
//
//        @Override
//        public String getId() {
//            return url.getCacheKey();
//        }
//
//        @Override
//        public void cancel() {
//            // TODO: call cancel on the client when this method is called on a background thread. See #257
//        }
//    }
//}
