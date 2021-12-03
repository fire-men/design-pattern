package com.example.demo.structorPattern.decorator;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 13:36:22
 * @Description shape装饰者抽象类
 */
public abstract class AbstractShapeDecorator implements Shape {
    protected Shape shape;

    public AbstractShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
