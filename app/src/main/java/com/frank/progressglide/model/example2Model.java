package com.frank.progressglide.model;

/**
 * Created by Noth on 10/8/2559.
 */

public class example2Model {

    private String id;
    private String url;
    private String imageDescription;

    public example2Model(String id ,String url, String imageDescription) {
        this.id = id;
        this.url = url;
        this.imageDescription = imageDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }
}
