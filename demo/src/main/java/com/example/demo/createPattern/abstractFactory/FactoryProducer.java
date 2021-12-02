package com.example.demo.createPattern.abstractFactory;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:08:38
 * @Description 返回具体的工厂
 */
public class FactoryProducer {

    public AbstractFactory newFactory(String factoryType){
        AbstractFactory factory = null;
        if (factoryType == null || "".equals(factoryType)) {
            throw  new IllegalArgumentException("您输入的参数不合法...........");
        }else if (factoryType.equals("shape")) {
            factory = new ShapeFactory();
        }else if (factoryType.equals("color")) {
            factory = new ColorFactory();
        }
        return factory;
    }
}
