package com.example.demo.behavePattern.observer;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:14:27
 * @Description 观察者-王五
 */
@Data
public class WuObserver extends Observer {

    public WuObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("current object {} "+this+", subject state {} "+subject.getState());    }
}
