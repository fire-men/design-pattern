package com.example.demo.behavePattern.strategy;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:43:53
 * @Description
 */
public class SubtractStrategy implements Strategy {

    @Override
    public Integer operate(int a, int b) {
        return a - b;
    }
}
