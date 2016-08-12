package com.frank.progressglide.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PONG on 9/24/14 AD.
 */
public class Chat {
    @SerializedName("id")
    private String id;
    @SerializedName("group_id")
    private String group_id;
    @SerializedName("user_id")
    private String user_id;
    @SerializedName("value")
    private String value;
    @SerializedName("image")
    private String image;
    @SerializedName("s_image")
    private String s_image;
    @SerializedName("c_image")
    private String c_image;
    @SerializedName("createdate")
    private String createdate;
    @SerializedName("status")
    private String status;
    @SerializedName("readed")
    private int readed;
    @SerializedName("width")
    private int width;
    @SerializedName("height")
    private int height;
    @SerializedName("type")
    private String type;
    @SerializedName("_type")
    private String _type;
    @SerializedName("file_path")
    private String file_path;
    @SerializedName("file_size")
    private String file_size;
    @SerializedName("file_title")
    private String file_title;
    @SerializedName("video")
    private String video;
    @SerializedName("video_type")
    private String video_type;
    @SerializedName("video_image")
    private String video_image;
    @SerializedName("firstname")
    private String firstname;
    @SerializedName("lastname")
    private String lastname;
    @SerializedName("profile_img3")
    private String profile_img3;
    @SerializedName("sticker")
    private String sticker;
    @SerializedName("sticker_big")
    private String sticker_big;
    @SerializedName("album_id")
    private String album_id;
    @SerializedName("album_count")
    private String album_count;
    @SerializedName("album_name")
    private String album_name;
    @SerializedName("album_update")
    private String album_update;
    @SerializedName("album_photo")
    private String album_photo;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("progressValue")
    private int progressValue;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getReaded() {
        return readed;
    }

    public void setReaded(int readed) {
        this.readed = readed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }

    public String getFile_title() {
        return file_title;
    }

    public void setFile_title(String file_title) {
        this.file_title = file_title;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideo_type() {
        return video_type;
    }

    public void setVideo_type(String video_type) {
        this.video_type = video_type;
    }

    public String getVideo_image() {
        return video_image;
    }

    public void setVideo_image(String video_image) {
        this.video_image = video_image;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfile_img3() {
        return profile_img3;
    }

    public void setProfile_img3(String profile_img3) {
        this.profile_img3 = profile_img3;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    public String getSticker_big() {
        return sticker_big;
    }

    public void setSticker_big(String sticker_big) {
        this.sticker_big = sticker_big;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_count() {
        return album_count;
    }

    public void setAlbum_count(String album_count) {
        this.album_count = album_count;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_update() {
        return album_update;
    }

    public void setAlbum_update(String album_update) {
        this.album_update = album_update;
    }

    public String getAlbum_photo() {
        return album_photo;
    }

    public void setAlbum_photo(String album_photo) {
        this.album_photo = album_photo;
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

    public int getProgressValue() {
        return progressValue;
    }

    public void setProgressValue(int progressValue) {
        this.progressValue = progressValue;
    }
}
