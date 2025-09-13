package com.chhei.designpattern.Structure.adpter.class_adapter;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard Read Completed !";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
