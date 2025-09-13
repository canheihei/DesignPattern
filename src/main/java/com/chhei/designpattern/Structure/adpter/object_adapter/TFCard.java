package com.chhei.designpattern.Structure.adpter.object_adapter;

// 适配者类接口
public interface TFCard {
    // 从TF卡中读数据
    String readTF();
    // 从TF卡中写数据
    void writeTF(String msg);

}
