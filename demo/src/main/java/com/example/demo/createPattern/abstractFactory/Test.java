package com.example.demo.createPattern.abstractFactory;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:12:22
 * @Description 设计模式之抽象工厂模式
 */
public class Test {
    public static void main(String[] args) {
        //获取指定工厂
        AbstractFactory factory = new FactoryProducer().newFactory("color");
        //从工厂获取指定的对象
        Color color = factory.newColor("red");
        color.fill();
    }
}
