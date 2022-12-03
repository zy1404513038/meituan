package com.skb.searchandorder;

import java.util.ArrayList;
import java.util.List;

public class GroupSession {

    public GroupSession() {
        setSessionsList();
    }

    public static List<Session> sessionsList = new ArrayList<>();

    public void setSessionsList() {
        sessionsList.add(new Session("1", "群聊KFC"));
        sessionsList.add(new Session("2", "群聊BBQ"));
    }

    public List<Session> getSessionsList() {
        return sessionsList;
    }

}
