package com.skb.searchandorder;

public class Session {

    public String id;
    public String sessionName;

    public Session(String id, String sessionName) {
        this.id = id;
        this.sessionName = sessionName;
    }

    public String getId() {
        return id;
    }

    public String getSessionName() {
        return sessionName;
    }
}
