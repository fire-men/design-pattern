package com.example.demo.structorPattern.decorator;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 13:35:00
 * @Description 柱形图
 */
public class Bar implements Shape {
    @Override
    public void draw() {
        System.out.println("============柱状图=======");

    }
}
