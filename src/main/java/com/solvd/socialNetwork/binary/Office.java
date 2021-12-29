package com.solvd.socialNetwork.binary;

public class Office {
    private long id;
    private String name;
    private long cityId;

    public Office() {
    }

    public Office(long id, String name, long cityId) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }
}
