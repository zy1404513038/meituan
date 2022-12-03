package com.skb.searchandorder;

import java.util.ArrayList;
import java.util.List;

/*---------------------------订单 Order 类 ------------------------------------------*/
public class Order {

    public static List<XiaoPiao> xiaoPiaos = new ArrayList<>();

    void add(XiaoPiao xiaopiao) {
        xiaoPiaos.add(xiaopiao);
    }

    //具体实现方法
    void display() {
        if(xiaoPiaos.size() == 0) {
            System.out.println("您还没有订单，快去下单吧\n");
        }else {
            System.out.println("您的订单如下：\n");

            for(XiaoPiao xiaoPiao : xiaoPiaos) {
                xiaoPiao.display();
            }
        }
        try {
            System.out.println("按任意键继续。。。");
            System.in.read();
        }
        catch(Exception ignored) {}
    }
}
