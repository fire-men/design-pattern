package com.example.demo.createPattern.abstractFactory;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 15:34:40
 * @Description 工厂类
 */
public class ShapeFactory extends AbstractFactory {

    public Shape newShape(String type) {
        Shape shape = null;
        if (type == null || "".equals(type)) {
            throw new RuntimeException("请输入正确的类型....");
        }
        if ("pie".equals(type)) {
            shape = new Pie();
        } else if ("bar".equals(type)) {
            shape = new Bar();
            //新增一个圆形，违背开闭原则
        } else if ("circle".equals(type)) {
            shape = new Circle();
        }else  {
            throw new RuntimeException("您输入的形状不正确，请重新输入");
        }
        return shape;
    }

    @Override
    Color newColor(String color) {
        return null;
    }
}
