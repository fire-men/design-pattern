package com.example.demo.behavePattern.observer;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:13:23
 * @Description 张三
 */
@Data
public class ZsObserver extends Observer {

    public ZsObserver(Subject subject) {
        this.subject = subject;
        //当创建实例后，自动将当前实例与mq主体绑定
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("current object {} "+this+", subject state {} "+subject.getState());
    }
}
