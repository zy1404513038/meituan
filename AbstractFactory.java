package com.skb.searchandorder;

/*---------------------------抽象工厂 AbstractFactory 类 ------------------------------------------*/
public abstract class AbstractFactory {
    public abstract Order getOrder();
    public abstract Notice getNotice();
    public abstract Group getGroup();
    public abstract AbstractShop getShop();
}
