package com.example.demo.structorPattern.proxy.stati;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 11:09:19
 * @Description 静态代理
 */
public class UserLoginProxy {
    private UserService userService;

    public UserLoginProxy(UserService userService) {
        this.userService = userService;
    }

    /**
     * 代理操作
     *  添加用户登录时日志打印功能
     */
    public void invoke(){
        System.out.println("log context {} 开始登录");
        this.userService.login();
        System.out.println("log context {} 退出系统");
    }
}
