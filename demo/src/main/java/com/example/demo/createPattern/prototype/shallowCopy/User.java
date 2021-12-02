package com.example.demo.createPattern.prototype.shallowCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 15:11:18
 * @Description 原型模式之浅拷贝
 *  浅拷贝特点：
 *   1、拷贝后的对象和拷贝前的对象引用地址不相同
 *   2、拷贝后的对象的引用类型变量和拷贝前的对象的引用类型的变量地址相同
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Cloneable {
    private String username;
    private Role role;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @SneakyThrows
    public static void main(String[] args) {
        User user = new User("张三", new Role("射手"));
        System.out.println(user);
        User user1 = (User)user.clone();
        System.out.println(user1);
        System.out.println(user == user1?"拷贝后的对象和拷贝前的对象引用地址相同":"拷贝后的对象和拷贝前的对象引用地址不相同");
        System.out.println(user.getRole() == user1.getRole()?"拷贝后的对象的引用类型变量和拷贝前的对象的引用类型的变量地址相同":"拷贝后的对象的引用类型变量和拷贝前的对象的引用类型的变量地址不相同");
    }
}
