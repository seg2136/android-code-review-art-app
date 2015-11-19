package com.example.guest.artiseverywhere.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by Guest on 10/29/15.
 */

@Table(name = "Artists", id = "_id")
public class Artist extends Model {

    @Column(name = "Name")
    private String mName;

    @Column(name = "ArtistInfo")
    private String mArtistInfo;

    @Column(name = "Image")
    private int mImage;

    public Artist() {
        super();
    }

    public Artist(String name, String artistInfo, int image) {
        super();
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

    public static List<Artist> all() {
        return new Select().from(Artist.class).execute();
    }
}
