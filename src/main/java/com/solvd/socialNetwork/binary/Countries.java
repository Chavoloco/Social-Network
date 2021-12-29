package com.solvd.socialNetwork.binary;

public class Countries extends Location{
    private long stateId;

    public Countries() {
    }

    public Countries(long id, String name, long stateId) {
        super(id, name);
        this.stateId = stateId;
    }

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }
}
