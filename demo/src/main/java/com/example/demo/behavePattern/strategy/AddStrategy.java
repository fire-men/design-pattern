package com.example.demo.behavePattern.strategy;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:43:39
 * @Description 加法运算策略
 */
public class AddStrategy implements Strategy {
    @Override
    public Integer operate(int a, int b) {
        return a + b;
    }
}
