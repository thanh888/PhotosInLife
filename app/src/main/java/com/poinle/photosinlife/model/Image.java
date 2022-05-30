package com.poinle.photosinlife.model;

public class Image {
    private int src_photo;
    private String name_photo;

    public int getSrc_photo() {
        return src_photo;
    }

    public void setSrc_photo(int src_photo) {
        this.src_photo = src_photo;
    }

    public String getName_photo() {
        return name_photo;
    }

    public void setName_photo(String name_photo) {
        this.name_photo = name_photo;
    }

    public Image(int src_photo, String name_photo) {
        this.src_photo = src_photo;
        this.name_photo = name_photo;
    }
}
