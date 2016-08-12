package com.frank.progressglide;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example1ViewHolder extends RecyclerView.ViewHolder {

    public TextView chatmessage, username, file_name, file_size, file_type, chattime, chat_id, read_group, chattime_group, chat_type, sticker_code, albumCount, label_albumName, label_albumStatus, chatmap;
    public ImageView sticker, read_user, file_background, userImage, chat_image, albumImage, share_icon,voice_pause,imageViewVideo,imageViewPlay;
    public FrameLayout bubble;
    public TableRow customList;
    public FrameLayout whiteBubble;
    public FrameLayout yellowBubble;
    public ProgressBar progressBar;
    public RelativeLayout progressBarView;
    public CheckBox forward;

    public Example1ViewHolder(View view) {
        super(view);

    }


}
