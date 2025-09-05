package com.chhei.designpattern.Creator.prototype.test3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTest {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        Student stu = new Student();

        stu.setName("mike");
        citation.setStu(stu);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/Data/Study_Code/DesignPattern/src/main/java/com/chhei/designpattern/Creator/prototype/test3/a.txt"));

        // 序列化到接口
        oos.writeObject(citation);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/Data/Study_Code/DesignPattern/src/main/java/com/chhei/designpattern/Creator/prototype/test3/a.txt"));
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        Student stu1 = citation1.getStu();
        stu1.setName("amy");
        citation.show();
        citation1.show();
    }
}
