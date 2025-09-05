package com.chhei.designpattern.Creator.prototype.test2;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("mike");
        citation.setStu(stu);

        // 深克隆
        Citation citation1 = citation.clone();
        citation1.getStu().setName("amy");

//        citation.setName("mike");
//        citation1.setName("amy");`

        citation.show();
        citation1.show();
    }
}
