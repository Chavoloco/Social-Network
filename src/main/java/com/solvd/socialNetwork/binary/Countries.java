package com.solvd.socialNetwork.binary;

import javax.xml.bind.annotation.XmlElement;

public class Countries {
    private long id;
    private String name;

    public Countries() {
    }

    public Countries(long id, String name) {
        this.id = id;
        this.name = name;
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
}
