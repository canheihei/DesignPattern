package com.chhei.designpattern.Creator.builder.demo2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("AMD")
                .screen("京东方")
                .memory("三星")
                .mainboard("rog")
                .build();
        System.out.println(phone);
    }
}
