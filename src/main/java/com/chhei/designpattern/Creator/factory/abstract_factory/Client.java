package com.chhei.designpattern.Creator.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.creatDessert();

        System.out.println(coffee.getName());
        dessert.show();

    }
}
