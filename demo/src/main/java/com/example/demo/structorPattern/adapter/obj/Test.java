package com.example.demo.structorPattern.adapter.obj;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 10:59:29
 * @Description 设计模式之对象适配器(组合)
 */
public class Test {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adatper adatper = new Adatper(adaptee);
        adatper.eat();
    }

}
