package com.example.demo.behavePattern.strategy;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:44:40
 * @Description
 */
public class MultiplyStrategy implements Strategy {

    @Override
    public Integer operate(int a, int b) {
        return a * b;
    }
}
