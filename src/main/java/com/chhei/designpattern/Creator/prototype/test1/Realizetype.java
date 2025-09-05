package com.chhei.designpattern.Creator.prototype.test1;

public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("prototype object built success!");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("copied success!");
        return (Realizetype) super.clone();
    }
}
