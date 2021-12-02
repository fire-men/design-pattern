package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:36:55
 * @Description 食物条目
 */
public interface Item {
    /**
     * 获取食物名称
     *
     * @return
     */
    String name();

    /**
     * 获取食物价格
     *
     * @return
     */
    Float getPrice();

    /**
     * 食物进行打包
     *
     * @return
     */
    Packing pack();



}
