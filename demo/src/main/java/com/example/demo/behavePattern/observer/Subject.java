package com.example.demo.behavePattern.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:01:39
 * @Description 类似于MQ
 */
@Data
public class Subject {
    /*订阅的所有观察者*/
    private List<Observer> observers = new ArrayList<Observer>();
    /*mq主体状态变化*/
    private Integer state;

    /**
     * 捆绑订阅者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知所有订阅者同步内容
     */
    public void notifyAllObservers(){
        for (int i = 0; i <observers.size() ; i++) {
            observers.get(i).update();
        }
    }

    public void setState(Integer state){
        this.state = state;
        notifyAllObservers();
    }
}

