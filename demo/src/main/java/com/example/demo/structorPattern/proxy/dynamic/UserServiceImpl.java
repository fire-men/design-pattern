package com.example.demo.structorPattern.proxy.dynamic;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 11:08:25
 * @Description
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login(String username) {
        System.out.println("============登录业务============");
    }

    @Override
    public void exit() {
        System.out.println("============退出系统============");
    }
}
