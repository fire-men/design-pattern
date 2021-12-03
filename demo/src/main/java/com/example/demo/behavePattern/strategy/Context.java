package com.example.demo.behavePattern.strategy;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:50:35
 * @Description
 */
public class Context {
    //组合策略接口
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     * @param a
     * @param b
     * @return
     */
    public Integer executeStrategy(int a, int b) {
       return this.strategy.operate(a,b);
    }
}
