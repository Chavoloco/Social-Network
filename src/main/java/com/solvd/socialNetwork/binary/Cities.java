package com.solvd.socialNetwork.binary;


import javax.xml.bind.annotation.XmlElement;

public class Cities {
    private long cityId;
    private String cityName;

    public Cities() {
    }

    public Cities(long cityId, String name) {
        this.cityId = cityId;
        this.cityName = name;
    }

    public long getId() {
        return cityId;
    }

    public void setId(long id) {
        this.cityId = id;
    }

    public String getName() {
        return cityName;
    }

    public void setName(String name) {
        this.cityName = name;
    }
}
