package com.frank.progressglide.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PONG on 11/26/15 AD.
 */
public class JsonUserRead {
    @SerializedName("user_id")    public String user_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
