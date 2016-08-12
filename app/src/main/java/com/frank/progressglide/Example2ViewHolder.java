package com.frank.progressglide;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example2ViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;

    public Example2ViewHolder(View view) {
        super(view);
        imageView = (ImageView) view.findViewById(R.id.imgViewExample2_list_item);
        textView = (TextView) view.findViewById(R.id.txtViewExample2_list_item);
    }
}
