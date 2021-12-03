package com.example.demo.structorPattern.adapter.clas;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 10:49:35
 * @Description
 */
public class ConcreteTarget implements Target {
    @Override
    public void eat() {
        System.out.println("具体目标类执行特有的eat方法");
    }
}
