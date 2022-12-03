package com.skb.searchandorder;

import java.util.Scanner;

//具体工厂类 ShopFactory
public class ShopFactory extends AbstractFactory{
    Scanner in = new Scanner(System.in);
    @Override
    public Order getOrder() {
        return null;
    }
    @Override
    public Notice getNotice() {
        return null;
    }
    @Override
    public Group getGroup() {
        return null;
    }
    @Override
    public AbstractShop getShop() {

        System.out.println("当前有的店家shop有：\n" + "1:KFC\n" + "2:垚哥烧烤店");
        System.out.print("请输入你想浏览的店家id(-1退出):");
        int i;
        while(true) {
            i = in.nextInt();
            if(i==-1){
                break;
            }else if(i==1){
                return new KFC();
            }else if(i==2){
                return new Barbecue();
            }else{
                System.out.print("请输入有效数字:");
            }
        }
        return null;
    }
}
