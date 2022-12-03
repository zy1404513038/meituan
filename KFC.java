package com.skb.searchandorder;

import java.util.Scanner;

//具体产品类 KFC
public class KFC extends AbstractShop{
    Scanner in = new Scanner(System.in);

    public KFC() {
        visit();
    }

    @Override
    public void visit() {
        System.out.println("/*---------------------------欢迎来到董哥KFC ------------------------------------------*/");
        //展示餐单
        Menu_KFC menu = new Menu_KFC();
        menu.display();
        System.out.print("是否需要点餐？（1:是 / 其它：否）:");
        int answer = in.nextInt();
        if(answer==1) {
            //点餐
            order();
        }
        try {
            System.out.println("按任意键继续。。。");
            System.in.read();
        }
        catch(Exception ignored) {}
    }

    public void order() {
        System.out.print("开始点餐,请输入需要菜品的id (结束：-1)：");
        //创建账单
        XiaoPiao xiaopiao = new XiaoPiao("KFC");
        int id, i=0;
        while(true){
            //账单没满则选择食物并记录账单
            if(i>=50){
                System.out.println("订单数额已满，不能继续点餐了，sorry");
                break;
            }
            //输入需要餐品的id
            id = in.nextInt();
            //id为-1时表示结束点餐
            if(id==-1){
                System.out.println("结束点餐");
                break;
            }else if(id==1){
                Hamburger food = new Hamburger();
                xiaopiao.add(food);
                i += 1;
            }else if(id==2){
                Coko food = new Coko();
                xiaopiao.add(food);
                i += 1;
            }else if(id==3){
                Hoddog food = new Hoddog();
                xiaopiao.add(food);
                i += 1;
            }else{
                System.out.println("没有这个餐品id");
            }
            System.out.print("请继续点餐：");
        }

        Order.xiaoPiaos.add(xiaopiao);
        //退出点餐后显示账单
        System.out.println("您的订单为:");
        xiaopiao.display();
        System.out.println("请支付");
        System.out.println("KFC浏览完毕\n");
    }

}
