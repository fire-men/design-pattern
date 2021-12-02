package com.example.demo.createPattern.factory;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 15:40:03
 * @Description 设计模式之工厂模式
 *  优点：创建对象的逻辑被隐藏
 *  缺点：违背开闭原则
 */
public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.newShape("pie").draw();
        shapeFactory.newShape("bar").draw();

        //新增一个圆形类，势必要修改工厂类中的程序，违背开闭原则
        shapeFactory.newShape("circle").draw();

    }

}

