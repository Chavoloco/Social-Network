package com.solvd.socialNetwork.binary;

public class VideosHasPost {
    private long videosId;
    private long postId;

    public VideosHasPost() {
    }

    public VideosHasPost(long videosId, long postId) {
        this.videosId = videosId;
        this.postId = postId;
    }

    public long getVideosId() {
        return videosId;
    }

    public void setVideosId(long videosId) {
        this.videosId = videosId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }
}
