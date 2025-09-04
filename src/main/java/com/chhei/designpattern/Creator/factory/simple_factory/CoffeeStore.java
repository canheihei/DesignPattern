package com.chhei.designpattern.Creator.factory.simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 声明Coffee类型的变量，根据不同类型，创建不同类型的子类对象
        Coffee coffee = factory.createCoffee(type);
        if("latte".equals(type)) {
            coffee.addMilk();
        }
        coffee.addSugar();
        return coffee;
    }
}
