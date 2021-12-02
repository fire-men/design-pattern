package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:42:14
 * @Description 汉堡抽象类
 */
public abstract class Burger implements Item {
    public Packing pack() {
        return new Wrapper();
    }
}
