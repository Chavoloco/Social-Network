package com.solvd.socialNetwork.binary;

import java.util.Date;

public class Videos {
    private long id;
    private long userId;
    private String videoFilename;
    private String videoDetails;
    private String videoFormat;
    private Date playingTime;

    public Videos() {
    }

    public Videos(long id, long userId, String videoFilename, String videoDetails, String videoFormat, Date playingTime) {
        this.id = id;
        this.userId = userId;
        this.videoFilename = videoFilename;
        this.videoDetails = videoDetails;
        this.videoFormat = videoFormat;
        this.playingTime = playingTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getVideoFilename() {
        return videoFilename;
    }

    public void setVideoFilename(String videoFilename) {
        this.videoFilename = videoFilename;
    }

    public String getVideoDetails() {
        return videoDetails;
    }

    public void setVideoDetails(String videoDetails) {
        this.videoDetails = videoDetails;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    public Date getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(Date playingTime) {
        this.playingTime = playingTime;
    }
}
