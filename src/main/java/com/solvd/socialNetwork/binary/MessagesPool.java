package com.solvd.socialNetwork.binary;

public class MessagesPool {
    private long messagesId;
    private  long user_id;

    public MessagesPool() {
    }

    public MessagesPool(long messagesId, long user_id) {
        this.messagesId = messagesId;
        this.user_id = user_id;
    }

    public long getMessagesId() {
        return messagesId;
    }

    public void setMessagesId(long messagesId) {
        this.messagesId = messagesId;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
