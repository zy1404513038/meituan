package com.skb.searchandorder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //定义工厂类对象和产品类对象
        AbstractFactory fac = new OrderFactory();
        Order order = fac.getOrder();
        GroupSession groupSession = new GroupSession();
        Notice notice;
        Group group;
        AbstractShop shop;

        int i;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("/*---------------------------欢迎来到美团 ------------------------------------------*");
            System.out.println("请输入您想浏览的界面（输入id数字即可）");
            System.out.print("1:店家shop\n" + "2:订单order\n" + "3:公告notice\n" + "4:群聊group\n" + "-1:退出美团\n" + "请输入：");
            i = in.nextInt();;
            if(i==-1){
                break;
            }else if(i==1){
                System.out.println("/*---------------------------进入店家页面 ------------------------------------------*");
                fac = new ShopFactory();
                shop = fac.getShop();
            }else if(i==2){
                System.out.println("/*---------------------------进入订单页面 ------------------------------------------*/");
                order.display();
            }else if(i==3){
                System.out.println("/*---------------------------进入公告页面 ------------------------------------------*/");
                fac = new NoticeFactory();
                notice = fac.getNotice();
            }else if(i==4){
                System.out.println("/*---------------------------进入群聊页面 ------------------------------------------*/");
                fac = new GroupFactory();
                group = fac.getGroup();
            }else{
                System.out.println("请输入有效数字");
            }
        }
        try {
            System.out.println("按任意键退出。。。");
            System.in.read();
        }
        catch(Exception ignored) {}
    }
}
