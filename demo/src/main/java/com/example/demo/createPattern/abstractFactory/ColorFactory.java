package com.example.demo.createPattern.abstractFactory;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:05:12
 * @Description
 */
public class ColorFactory extends AbstractFactory {
    Shape newShape(String type) {
        return null;
    }

    Color newColor(String color) {
        Color color1 = null;
        if (color == null || "".equals(color)) {
            throw new IllegalArgumentException("您输入的参数不合法.....");
        }else if (color.equals("red")) {
            color1 = new Red();
        }else if (color.equals("blue")) {
            color1 = new Blue();
        }
        return color1;
    }
}
