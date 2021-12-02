package com.example.demo.createPattern.singleton.lazyMen;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 13:44:49
 * @Description 单例模式之懒汉模式
 * 特点：
 *  1、懒加载
 *  2、对象不是线程安全的
 *     解决：volatile + synchronize + 双重检查
 *
 */
public class SingletonObject {
    private static volatile SingletonObject obj = null;

    private SingletonObject() { }

    public static SingletonObject newInstance(){
        if (obj == null) {
            //多线程情况下
            synchronized (SingletonObject.class){
                //防止第一个线程创建完毕后，其他线程再次创建对象，违背单例模式规则
                if (obj == null) {
                    obj = new SingletonObject();
                }
            }
        }
        return obj;
    }
}
