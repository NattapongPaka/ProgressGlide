package com.frank.progressglide.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PONG on 11/26/15 AD.
 */

public class JsonChatResponse {

    @SerializedName("type") public String type;
    @SerializedName("data") public List<JsonChat> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<JsonChat> getData() {
        return data;
    }

    public void setData(List<JsonChat> data) {
        this.data = data;
    }
}
