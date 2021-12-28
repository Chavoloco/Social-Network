package com.solvd.socialNetwork.binary;

import java.util.Date;

public class Messages {
    private long id;
    private String msgContent;
    private Date dateTime;

    public Messages() {
    }

    public Messages(long id, String msgContent, Date dateTime) {
        this.id = id;
        this.msgContent = msgContent;
        this.dateTime = dateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
