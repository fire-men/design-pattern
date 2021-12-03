package com.example.demo.behavePattern.template;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 15:09:30
 * @Description
 */
public class Dog extends Animal {
    public Dog() {
        this.name = "大黄";
        this.color = "黄色";
    }

    @Override
    void eat() {
        System.out.println(this.name+"在吃.............");
    }

    @Override
    void sleep() {
        System.out.println(this.name + "在睡..............");
    }

}
