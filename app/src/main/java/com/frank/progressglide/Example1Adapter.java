package com.frank.progressglide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.frank.progressglide.dao.JsonChat;
import com.frank.progressglide.dao.JsonChatResponse;
import com.frank.progressglide.model.ConfigSingleton;

/**
 * Created by Noth on 10/8/2559.
 */

public class Example1Adapter extends RecyclerView.Adapter {

    private JsonChatResponse jsonChatResponse;


    public Example1Adapter(JsonChatResponse jsonChatResponse) {
        this.jsonChatResponse = jsonChatResponse;
    }

    @Override
    public int getItemViewType(int position) {
        JsonChat row_pos = jsonChatResponse.data.get(position);
        if (row_pos.getAlbum_id() != null && !row_pos.getAlbum_id().equals("")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id()))
                return 12;
            else
                return 13;
        } else if (row_pos.getImage() != null && !row_pos.getImage().equals("")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id()))
                return 9;
            else
                return 8;
        } else if (row_pos.getId().equals("") && row_pos.getType() != null && row_pos.getType().equals("unreadmessage")) {
            return 14;
        } else if (row_pos.getId().equals("")) {
            return 7;
        } else if (row_pos.getFile_path() != null && !row_pos.getFile_path().equals("")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id()))
                return 6;
            else
                return 5;
        } else if (row_pos.getVideo() != null && !row_pos.getVideo().equals("") && row_pos.getVideo_type() != null && row_pos.getVideo_type().equals("voice")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id()))
                return 18;
            else
                return 17;
        } else if (row_pos.getVideo() != null && !row_pos.getVideo().equals("")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id()))
                return 11;
            else
                return 10;
        } else if (row_pos.getValue() != null && !row_pos.getValue().equals("")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id()))
                return 3;
            else
                return 2;
        } else if (row_pos.getLatitude() != null && row_pos.getLongitude() != null && !row_pos.getLatitude().equals("") && !row_pos.getLongitude().equals("")) {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id())) {
                return 16;
            } else {
                return 15;
            }
        } else if (row_pos.getType() != null && !row_pos.getType().equals("") && !row_pos.getType().equals("message") && !row_pos.getType().equals("problem")) {
            return 4;
        } else {
            if (ConfigSingleton.getInstantce().getUser_id().equals(row_pos.getUser_id())) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
