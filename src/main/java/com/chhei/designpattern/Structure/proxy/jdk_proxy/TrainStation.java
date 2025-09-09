package com.chhei.designpattern.Structure.proxy.jdk_proxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("train stations sell");
    }
}
