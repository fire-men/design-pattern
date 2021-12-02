package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:47:05
 * @Description 牛肉汉堡
 */
public class VegBurger extends Burger {

    public String name() {
        return "牛肉汉堡";
    }

    public Float getPrice() {
        return 15.0f;
    }
}
