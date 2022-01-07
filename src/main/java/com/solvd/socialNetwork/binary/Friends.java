package com.solvd.socialNetwork.binary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Friends {
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lname")
    private String lastName;
    @JsonProperty("basicInfoId")
    private long basicInfoId;

    public Friends() {
    }

    public Friends(long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Friends(long id, String name, String lastName, long basicInfoId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.basicInfoId = basicInfoId;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(long basicInfoId) {
        this.basicInfoId = basicInfoId;
    }
}
