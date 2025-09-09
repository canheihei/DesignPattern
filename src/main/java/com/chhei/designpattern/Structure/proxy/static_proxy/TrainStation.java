package com.chhei.designpattern.Structure.proxy.static_proxy;

public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("train stations sell");
    }
}
