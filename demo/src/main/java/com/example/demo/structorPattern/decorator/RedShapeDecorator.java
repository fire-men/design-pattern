package com.example.demo.structorPattern.decorator;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 13:40:08
 * @Description 装饰者实现类
 */
public class RedShapeDecorator extends AbstractShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedShapeDecorator();
    }

    public void setRedShapeDecorator(){
        System.out.println("为当前形状添加了color --> red");
    }
}
