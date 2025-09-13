package com.chhei.designpattern.Structure.adpter.object_adapter;

// 适配者类
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
