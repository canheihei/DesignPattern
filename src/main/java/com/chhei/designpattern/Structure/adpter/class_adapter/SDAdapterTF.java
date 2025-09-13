package com.chhei.designpattern.Structure.adpter.class_adapter;

/**
 * 适配器类:SD去适配TF,TF去执行
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
