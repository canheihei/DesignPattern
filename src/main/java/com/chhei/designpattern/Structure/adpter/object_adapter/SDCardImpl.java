package com.chhei.designpattern.Structure.adpter.object_adapter;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write" + msg);
    }
}
