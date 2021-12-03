package com.example.demo.structorPattern.adapter.obj;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 10:43:45
 * @Description 适配器类
 */
public class Adatper  implements Target {
    //组合代替继承
    Adaptee adaptee;

    public Adatper(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void eat() {
        System.out.println("适配器类执行eat方法");
        this.adaptee.say();
    }


}
