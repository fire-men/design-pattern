package com.example.demo.createPattern.singleton.hungryMen;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 13:41:35
 * @Description 单例模式之恶汉模式
 */
public class SingletonObject {
    private static SingletonObject obj = new SingletonObject();

    /*防止外部创建对象，违背单例模式规则(一个对象)*/
    private SingletonObject() {}

    public SingletonObject newInstance(){
        return obj;
    }

}
