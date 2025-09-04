package com.chhei.designpattern.Creator.factory.abstract_factory;

public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Dessert creatDessert() {
        return new MatchaMousse();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
