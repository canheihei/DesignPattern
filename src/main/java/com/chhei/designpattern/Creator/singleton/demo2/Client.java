package com.chhei.designpattern.Creator.singleton.demo2;

import com.chhei.designpattern.Creator.singleton.demo1.Singleton;

/*
测试类
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
