package com.example.demo.structorPattern.proxy.stati;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 11:08:25
 * @Description
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        System.out.println("============登录业务============");
    }
}
