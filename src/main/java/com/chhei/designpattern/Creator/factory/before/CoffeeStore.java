package com.chhei.designpattern.Creator.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型，创建不同类型的子类对象
        Coffee coffee = null;
        if("American".equals(type)){
            coffee=new AmericanCoffee();
        }else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
            coffee.addMilk();
        }else{
            throw new RuntimeException("本店无此咖啡。");
        }
        coffee.addSugar();
        return coffee;
    }
}
