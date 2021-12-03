package com.example.demo.structorPattern.adapter.clas;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 10:52:48
 * @Description 设计模式之类适配器模式
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.eat();

        Adaptee adaptee = new Adaptee();
        adaptee.say();

        Adatper adatper = new Adatper();
        adatper.say();
        adatper.eat();
    }
}
