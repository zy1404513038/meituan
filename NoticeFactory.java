package com.skb.searchandorder;

//具体工厂类 NoticeFactory
public class NoticeFactory extends AbstractFactory{
    @Override
    public Order getOrder() {
        return null;
    }
    @Override
    public Notice getNotice() {
        return new Notice();
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
