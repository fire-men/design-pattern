package com.example.demo.structorPattern.decorator;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 13:34:22
 * @Description 饼状
 */
public class Pie implements Shape {
    @Override
    public void draw() {
        System.out.println("============饼状图=======");
    }
}
