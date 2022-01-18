package com.solvd.socialNetwork.binary;

import java.util.List;

public class MessagesPool {
    private List<Messages> messages;
    private List<User> users;

    public MessagesPool() {
    }

    public MessagesPool(List<Messages> messages, List<User> users) {
        this.messages = messages;
        this.users = users;
    }

    public List<Messages> getMessages() {
        return messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
