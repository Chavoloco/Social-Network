package com.solvd.socialNetwork.binary;

public class States extends Location{
    private long cityId;

    public States() {
    }

    public States(long id, String name, long cityId) {
        super(id, name);
        this.cityId = cityId;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }
}
