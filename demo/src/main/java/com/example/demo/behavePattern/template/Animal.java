package com.example.demo.behavePattern.template;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 15:06:57
 * @Description
 */
public abstract class Animal {
    protected String name;
    protected String color;

    abstract void eat();
    abstract void sleep();

    public final void run(){
        System.out.println("基类 --- run");
    }
}
