package com.chhei.designpattern.Creator.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        store.orderCoffee(americanCoffeeFactory);
    }
}
