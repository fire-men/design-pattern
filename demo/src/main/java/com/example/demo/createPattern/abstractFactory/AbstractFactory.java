package com.example.demo.createPattern.abstractFactory;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:02:06
 * @Description
 */
public abstract class AbstractFactory {
    abstract Shape newShape(String type);

    abstract Color newColor(String color);
}
