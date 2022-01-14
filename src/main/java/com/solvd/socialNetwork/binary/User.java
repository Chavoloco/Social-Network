package com.solvd.socialNetwork.binary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class User {
    @JsonProperty("id")
    private long id;
    @JsonProperty("username")
    private String userName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("last connection")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy HH:mm:ss")
    private Date lastConnection;
    @JsonProperty("profileId")
    private long profileId;
    @JsonProperty("friendId")
    private long friendId;

    public User() {
    }

    public User(int id, String userName, String password, long profileId, long friendId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.profileId = profileId;
        this.friendId = friendId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public long getFriendId() {
        return friendId;
    }

    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }

    public Date getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", last connection='" + lastConnection + '\'' +
                ", profileId=" + profileId +
                ", friendId=" + friendId +
                '}';
    }
}
