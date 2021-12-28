package com.solvd.socialNetwork.binary;

public class Pictures {
    private long id;
    private String picturesTitle;
    private String picturesFileName;

    public Pictures() {
    }

    public Pictures(long id, String picturesTitle, String picturesFileName) {
        this.id = id;
        this.picturesTitle = picturesTitle;
        this.picturesFileName = picturesFileName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPicturesTitle() {
        return picturesTitle;
    }

    public void setPicturesTitle(String picturesTitle) {
        this.picturesTitle = picturesTitle;
    }

    public String getPicturesFileName() {
        return picturesFileName;
    }

    public void setPicturesFileName(String picturesFileName) {
        this.picturesFileName = picturesFileName;
    }
}
