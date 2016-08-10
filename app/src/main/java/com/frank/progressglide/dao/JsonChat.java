package com.frank.progressglide.dao;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonChat {
    @SerializedName("id") public String id;
    @SerializedName("group_id") public String group_id;
    @SerializedName("user_id") public String user_id;
    @SerializedName("createdate") public String createdate;
    @SerializedName("id_old") public String id_old;
    @SerializedName("type") public String type;
    @SerializedName("_type") public String _type;
    @SerializedName("value") public String value;
    @SerializedName("sendreadpubnub") public String sendreadpubnub;
    @SerializedName("readed") public String readed;
    @SerializedName("image") public String image;
    @SerializedName("s_image") public String s_image;
    @SerializedName("c_image") public String c_image;
    @SerializedName("width") public String width;
    @SerializedName("height") public String height;
    @SerializedName("file_title") public String file_title;
    @SerializedName("file_size") public String file_size;
    @SerializedName("file_path") public String file_path;
    @SerializedName("video") public String video;
    @SerializedName("album_id") public String album_id;
    @SerializedName("album_name") public String album_name;
    @SerializedName("album_count") public String album_count;
    @SerializedName("album_photo") public String album_photo;
    @SerializedName("album_update") public String album_update;
    @SerializedName("album_status") public String album_status;
    @SerializedName("m") public Integer m;
    @SerializedName("device") public String device;
    @SerializedName("send_id") public String send_id;
    @SerializedName("video_image") public String video_image;
    @SerializedName("video_type") public String video_type;
    @SerializedName("latitude") public String latitude;
    @SerializedName("longitude") public String longitude;
    @SerializedName("readed_user") public List<JsonUserRead> readed_user;
    @SerializedName("receive_id") public String receive_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getId_old() {
        return id_old;
    }

    public void setId_old(String id_old) {
        this.id_old = id_old;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSendreadpubnub() {
        return sendreadpubnub;
    }

    public void setSendreadpubnub(String sendreadpubnub) {
        this.sendreadpubnub = sendreadpubnub;
    }

    public String getReaded() {
        return readed;
    }

    public void setReaded(String readed) {
        this.readed = readed;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getS_image() {
        return s_image;
    }

    public void setS_image(String s_image) {
        this.s_image = s_image;
    }

    public String getC_image() {
        return c_image;
    }

    public void setC_image(String c_image) {
        this.c_image = c_image;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getFile_title() {
        return file_title;
    }

    public void setFile_title(String file_title) {
        this.file_title = file_title;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_count() {
        return album_count;
    }

    public void setAlbum_count(String album_count) {
        this.album_count = album_count;
    }

    public String getAlbum_photo() {
        return album_photo;
    }

    public void setAlbum_photo(String album_photo) {
        this.album_photo = album_photo;
    }

    public String getAlbum_update() {
        return album_update;
    }

    public void setAlbum_update(String album_update) {
        this.album_update = album_update;
    }

    public String getAlbum_status() {
        return album_status;
    }

    public void setAlbum_status(String album_status) {
        this.album_status = album_status;
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getSend_id() {
        return send_id;
    }

    public void setSend_id(String send_id) {
        this.send_id = send_id;
    }

    public String getVideo_image() {
        return video_image;
    }

    public void setVideo_image(String video_image) {
        this.video_image = video_image;
    }

    public String getVideo_type() {
        return video_type;
    }

    public void setVideo_type(String video_type) {
        this.video_type = video_type;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<JsonUserRead> getReaded_user() {
        return readed_user;
    }

    public void setReaded_user(List<JsonUserRead> readed_user) {
        this.readed_user = readed_user;
    }

    public String getReceive_id() {
        return receive_id;
    }

    public void setReceive_id(String receive_id) {
        this.receive_id = receive_id;
    }
}
