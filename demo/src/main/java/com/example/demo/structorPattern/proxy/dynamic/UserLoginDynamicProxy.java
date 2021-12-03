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
    private Object obj;

    public UserLoginDynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log context {} start , method name {} "+method.getName()+", paramters[0] {} ");
        Object result = method.invoke(obj, args);
        System.out.println("log context {} end");
        return result;
    }

}
