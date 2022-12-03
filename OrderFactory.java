package com.skb.searchandorder;

//具体工厂类 OrderFactory
public class OrderFactory extends AbstractFactory{
    @Override
    public Order getOrder() {
        return new Order();
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
        return null;
    }
}
