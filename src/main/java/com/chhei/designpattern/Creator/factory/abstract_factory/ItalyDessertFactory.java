package com.chhei.designpattern.Creator.factory.abstract_factory;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Dessert creatDessert() {
        return new Trimisu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
