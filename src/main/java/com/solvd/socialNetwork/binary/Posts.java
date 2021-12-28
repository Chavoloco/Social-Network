package com.solvd.socialNetwork.binary;

public class Posts {
    private long id;
    private String postDetails;

    public Posts() {
    }

    public Posts(long id, String postDetails) {
        this.id = id;
        this.postDetails = postDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(String postDetails) {
        this.postDetails = postDetails;
    }
}
