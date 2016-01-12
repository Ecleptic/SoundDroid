package com.example.cameron.sounddroid.com.example.cameron.sounddroid.soundcloud;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Cameron on 7/14/15.
 */
public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String artworkURL;


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public int getID() {
        return mID;
    }

    public String getArtworkURL() {
        return artworkURL;
    }

    public String getAvatarURL() {
        String avatarURL = artworkURL;
        if (avatarURL != null) {
            artworkURL = artworkURL.replace("large", "tiny");
        }
        return avatarURL;
    }
}