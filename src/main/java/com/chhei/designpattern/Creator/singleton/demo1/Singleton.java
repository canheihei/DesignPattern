package com.chhei.designpattern.Creator.singleton.demo1;


/**
 * 饿汉式静态成员变量
 */
public class Singleton {
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
