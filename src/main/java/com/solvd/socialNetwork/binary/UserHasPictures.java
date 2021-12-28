package com.solvd.socialNetwork.binary;

public class UserHasPictures {
    private long userId;
    private long picturesId;

    public UserHasPictures() {
    }

    public UserHasPictures(long userId, long picturesId) {
        this.userId = userId;
        this.picturesId = picturesId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPicturesId() {
        return picturesId;
    }

    public void setPicturesId(long picturesId) {
        this.picturesId = picturesId;
    }
}
