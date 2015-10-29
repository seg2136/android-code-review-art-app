package com.example.guest.artiseverywhere.models;

/**
 * Created by Guest on 10/29/15.
 */
public class Artist {

    private String mName;
    private String mArtistInfo;
    private int mImage;

    public Artist(String name, String artistInfo, int image) {
        mName = name;
        mArtistInfo = artistInfo;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getArtistInfo() {
        return mArtistInfo;
    }

    public void setArtistInfo(String artistInfo) {
        mArtistInfo = artistInfo;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}
