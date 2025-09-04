package com.chhei.designpattern.Creator.factory.simple_factory;

public class Client {
    public static void main(String[] args) {
        // 创建咖啡店类对象
        //CoffeeStore store = new CoffeeStore();
        // Coffee coffee = store.orderCoffee("latte");
        //Coffee coffee2 = store.orderCoffee("american");
        Coffee coffee = SimpleCoffeeFactory.createCoffee("latte");

         System.out.println(coffee.getName());
        // System.out.println(coffee2.getName());
    }
}
