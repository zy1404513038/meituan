package com.skb.searchandorder;

/*---------------------------账单 Xiaopiao 类 ------------------------------------------*/
public class XiaoPiao {
    protected double total;
    protected String shopName;
    protected AbstractFood[] xiaopiao = new AbstractFood[50];
    protected int x = 0;
    void add(AbstractFood food) {
        xiaopiao[x++] = food;
    }

    public XiaoPiao(String name) {shopName = name;}
    public double getTotal() {
        double sum = 0;
        for(int i=0; i<x; i++) {
            sum += xiaopiao[i].getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.println("店名："+shopName);
        System.out.println("id\tname\tprice");
        String name;
        double money;
        for(int i=0; i<x; i++) {
            name = xiaopiao[i].getName();
            money = xiaopiao[i].getPrice();
            System.out.println((i+1) + "\t" + name + "\t" + money);
        }
        total = this.getTotal();
        System.out.println("total:"+ total);
    }

}
