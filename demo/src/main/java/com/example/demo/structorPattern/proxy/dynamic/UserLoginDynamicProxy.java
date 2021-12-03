package com.example.demo.structorPattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 11:17:36
 * @Description JDK动态代理
 */
public class UserLoginDynamicProxy implements InvocationHandler {
    //被代理的对象
    private Object obj;

    public UserLoginDynamicProxy(Object obj) {
        this.obj = obj;
    }

    /**
     *
     * @param proxy JVM运行时的代理对象
     * @param method 被代理的方法
     * @param args 被代理方法参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log context {} start , method name {} "+method.getName()+", paramters[0] {} ");
        Object result = method.invoke(obj, args);
        System.out.println("log context {} end");
        return result;
    }

}
