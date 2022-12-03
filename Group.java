package com.skb.searchandorder;

import java.util.List;

/*---------------------------群聊 Group 类 ------------------------------------------*/
public class Group {

    public Group() {
        visit();
    }

    //具体实现方法
    public void visit(){
        List<Session> sessionsList = GroupSession.sessionsList;
        if(sessionsList == null) {
            System.out.println("您还没有群聊，快去添加群聊吧\n");
        }else {
            System.out.println("群聊如下：");
            for (Session session : sessionsList) {
                System.out.printf("id：%s\t群聊昵称：%s\n", session.getId(), session.getSessionName());
            }
        }
        try {
            System.out.println("按任意键继续。。。");
            System.in.read();
        }
        catch(Exception ignored) {}
    }


}
