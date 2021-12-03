package com.example.demo.behavePattern.template;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 15:11:53
 * @Description 设计模式之模板模式(继承)
 *  特点：子类可以重写父类中非final修饰的方法
 */
public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.run();

        dog.eat();
        dog.sleep();
    }
}
