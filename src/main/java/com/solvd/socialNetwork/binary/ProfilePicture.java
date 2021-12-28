package com.solvd.socialNetwork.binary;

public class ProfilePicture {
    private long id;
    private long pictureId;
    private long profileId;

    public ProfilePicture() {
    }

    public ProfilePicture(long id, long pictureId, long profileId) {
        this.id = id;
        this.pictureId = pictureId;
        this.profileId = profileId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPictureId() {
        return pictureId;
    }

    public void setPictureId(long pictureId) {
        this.pictureId = pictureId;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }
}
