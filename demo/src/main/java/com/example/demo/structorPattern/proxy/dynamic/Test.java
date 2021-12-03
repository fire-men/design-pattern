package com.example.demo.structorPattern.proxy.dynamic;

import lombok.SneakyThrows;

import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 11:21:27
 * @Description 设计模式之动态代理
 */
public class Test {
    @SneakyThrows
    public static void main(String[] args) {
        //被代理的对象
        UserService userService = new UserServiceImpl();
        //自定义的代理对象
        UserLoginDynamicProxy loginDynamicProxy = new UserLoginDynamicProxy(userService);
        //获取JDK动态代理对象
        UserService proxy = (UserService) Proxy.newProxyInstance(loginDynamicProxy.getClass().getClassLoader(),userService.getClass().getInterfaces(), loginDynamicProxy);
        proxy.login("张三");

        TimeUnit.SECONDS.sleep(2);
        proxy.exit();

    }
}
