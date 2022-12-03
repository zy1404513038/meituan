package com.skb.searchandorder;

//具体工厂类 GroupFactory
public class GroupFactory extends AbstractFactory{
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
        return new Group();
    }
    @Override
    public AbstractShop getShop() {
        return null;
    }
}
