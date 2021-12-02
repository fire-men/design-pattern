package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:46:20
 * @Description 冷饮类
 */
public abstract class ColdDrink implements Item {
    public Packing pack() {
        return new Bottle();
    }
}
