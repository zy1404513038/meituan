package com.skb.searchandorder;

/*---------------------------公告 Notice 类 ------------------------------------------*/
public class Notice {
    public Notice() {
        visit();
    }
    void visit() {
        System.out.println("序号\t内容");
        System.out.println("1\t今日美团满20减10元！！！");
        System.out.println("2\t某某烧烤店由于卫生不合格即将倒闭。");
        System.out.println("3\t明日下午22：00美团将进入维护，请各位店家顾客理解。");
        System.out.println("按任意键继续。。。");
        try {
            System.in.read();
        }
        catch(Exception ignored) {}
    }

}

