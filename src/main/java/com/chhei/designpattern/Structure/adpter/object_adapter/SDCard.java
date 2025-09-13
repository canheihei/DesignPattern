package com.chhei.designpattern.Structure.adpter.object_adapter;

public interface SDCard {
    // 从SD卡读数据
    String readSD();
    // 从SD卡写数据
    void writeSD(String msg);
}
