package com.example.demo.structorPattern.decorator;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 13:45:07
 * @Description 设计模式之装饰者模式
 *  特点：
 *   允许向一个现有的对象添加新的功能，同时又不改变其结构
 */
public class Test {
    public static void main(String[] args) {
        Pie pie = new Pie();
        Bar bar = new Bar();
        Shape decorator = new RedShapeDecorator(pie);
        decorator.draw();

    }
}
