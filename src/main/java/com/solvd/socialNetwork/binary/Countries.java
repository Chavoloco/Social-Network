package com.solvd.socialNetwork.binary;

public class Countries {
    private long id;
    private String name;
    private long stateId;

    public Countries() {
    }

    public Countries(long id, String name, long stateId) {
        this.id = id;
        this.name = name;
        this.stateId = stateId;
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

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }
}
