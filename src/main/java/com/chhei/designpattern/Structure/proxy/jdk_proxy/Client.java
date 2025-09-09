package com.chhei.designpattern.Structure.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true){

        }
    }
}
