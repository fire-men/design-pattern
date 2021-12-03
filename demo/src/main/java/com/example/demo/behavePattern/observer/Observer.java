package com.example.demo.behavePattern.observer;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:02:13
 * @Description 观察者抽象类
 */
@Data
public abstract class Observer {
    /**
     * 监听具体的mq主体
     */
    protected Subject subject;

    /**
     * 当mq主体发生改变时，及时更新内容
     */
    public abstract void update();
}
