package com.solvd.socialNetwork.binary;

public class UserHasPost {
    private long userId;
    private long postsId;

    public UserHasPost() {
    }

    public UserHasPost(long userId, long postsId) {
        this.userId = userId;
        this.postsId = postsId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPostsId() {
        return postsId;
    }

    public void setPostsId(long postsId) {
        this.postsId = postsId;
    }
}
