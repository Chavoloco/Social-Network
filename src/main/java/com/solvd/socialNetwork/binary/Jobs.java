package com.solvd.socialNetwork.binary;

public class Jobs {
    private long id;
    private String name;
    private long roleId;
    private long officeId;

    public Jobs() {
    }

    public Jobs(long id, String name, long roleId, long officeId) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
        this.officeId = officeId;
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

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }
}
