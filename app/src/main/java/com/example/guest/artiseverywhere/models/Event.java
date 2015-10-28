package com.example.guest.artiseverywhere.models;

/**
 * Created by Guest on 10/28/15.
 */
public class Event {
    private String mDate;
    private String mVenue;
    private String mLocation;


    public Event(String date, String venue, String location) {
        mDate = date;
        mVenue = venue;
        mLocation = location;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getVenue() {
        return mVenue;
    }

    public void setVenue(String venue) {
        mVenue = venue;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }
}
