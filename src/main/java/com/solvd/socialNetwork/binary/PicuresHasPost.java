package com.solvd.socialNetwork.binary;

public class PicuresHasPost {
    private long picturesId;
    private long postsId;

    public PicuresHasPost() {
    }

    public PicuresHasPost(long picturesId, long postsId) {
        this.picturesId = picturesId;
        this.postsId = postsId;
    }

    public long getPicturesId() {
        return picturesId;
    }

    public void setPicturesId(long picturesId) {
        this.picturesId = picturesId;
    }

    public long getPostsId() {
        return postsId;
    }

    public void setPostsId(long postsId) {
        this.postsId = postsId;
    }
}
