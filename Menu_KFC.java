package com.skb.searchandorder;

public class Menu_KFC extends AbstractMenu {
    @Override
     void display(){
         System.out.println("菜单如下：");
         System.out.println("id\tname\tprice(元)");
         System.out.println("1\tHamburger\t15");
         System.out.println("2\tCoko\t5");
         System.out.println("3\tHoddog\t10");
    }

}
