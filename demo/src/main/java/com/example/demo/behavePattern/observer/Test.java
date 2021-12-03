package com.example.demo.behavePattern.observer;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:23:27
 * @Description 设计模式之观察者模式
 * 特点：
 *  定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer zs = new ZsObserver(subject);
        Observer ls = new LsObserver(subject);
        Observer wu = new WuObserver(subject);

        //修改当前mq主体状态，会自动通知给所有订阅者同步内容
        subject.setState(0);

    }
}
