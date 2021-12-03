package com.example.demo.structorPattern.proxy.stati;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 11:13:17
 * @Description 设计模式之静态代理
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("----------------正常登录------------------");
        UserService userService = new UserServiceImpl();
        userService.login();

        System.out.println();
        System.out.println("----------------代理方式登录------------------");
        //使用代理方式
        UserLoginProxy proxy = new UserLoginProxy(userService);
        proxy.invoke();
    }
}
