package com.solvd.socialNetwork.binary;

public class Profile {
    private long id;
    private String profileDetails;

    public Profile() {
    }

    public Profile(long id, String profileDetails) {
        this.id = id;
        this.profileDetails = profileDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfileDetails() {
        return profileDetails;
    }

    public void setProfileDetails(String profileDetails) {
        this.profileDetails = profileDetails;
    }
}
