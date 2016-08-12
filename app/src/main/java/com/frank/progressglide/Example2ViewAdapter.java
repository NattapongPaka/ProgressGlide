package com.frank.progressglide;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.frank.progressglide.model.example2Model;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example2ViewAdapter extends RecyclerView.Adapter<Example2ViewHolder> {

    private ArrayList<example2Model> modelArrayList;
    private Context context;

    public Example2ViewAdapter(Context context,ArrayList<example2Model> modelArrayList) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @Override
    public Example2ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example2_list_item, null);
        LayoutInflater inflater = LayoutInflater.from(context);
        View convertView = inflater.inflate(R.layout.example2_list_item, viewGroup, false);
        return new Example2ViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(Example2ViewHolder holder, int position) {
        example2Model example2Model = modelArrayList.get(position);
        //Example2ViewHolder example2ViewHolder = (Example2ViewHolder) holder;
        /**
         * Example 2
         */
        if(example2Model != null) {
            try {
                String urlDecode = URLDecoder.decode(example2Model.getUrl(), "UTF-8");
                holder.textView.setText(example2Model.getId() + " : " + example2Model.getImageDescription() + "\n" + urlDecode);
                Glide.with(context)
                        .load("http://4k.com/wp-content/uploads/2014/06/4k-image-tiger-jumping.jpg")
                        .placeholder(ContextCompat.getDrawable(context, R.drawable.appicon))
                        .error(ContextCompat.getDrawable(context, R.drawable.ic_error))
                        .override(100, 100)
                        .fitCenter()
                        .into(holder.imageView);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int getItemCount() {
        return modelArrayList == null ? 0 : modelArrayList.size();
    }

    @Override
    public long getItemId(int position) {
        return modelArrayList == null ? 0 : Long.parseLong(modelArrayList.get(position).getId());
    }
}
