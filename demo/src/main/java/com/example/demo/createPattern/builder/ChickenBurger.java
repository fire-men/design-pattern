package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:48:36
 * @Description 牛肉汉堡
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "鸡肉汉堡";
    }

    public Float getPrice() {
        return 12.0f;
    }
}
