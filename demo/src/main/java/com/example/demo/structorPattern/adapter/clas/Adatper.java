package com.example.demo.structorPattern.adapter.clas;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 10:43:45
 * @Description 适配器类
 */
public class Adatper extends Adaptee implements Target {

    @Override
    public void eat() {
        System.out.println("适配器类执行eat方法");
    }

    @Override
    public void say() {
        System.out.println("适配置类执行say方法");
    }
}
