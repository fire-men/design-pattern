package com.example.demo.principle.srp.negative;

import com.example.demo.domain.Customer;

import java.util.List;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:08:41
 * @Description 客户相关操作
 *  违背单一职责原则：一个类只负责某一类功能
 */
public class CustomerDataChart {

    /**
     * 获取DB Connection对象
     */
    public void getConnection(){
        System.out.println("-------------获取数据库连接对象------------");
    }

    /**
     * 添加客户
     * @param customer
     */
    public void insert(Customer customer){
        System.out.println("-------------用户创建完毕------------");
    }

    /**
     * 查询客户列表
     * @return
     */
    public List<Customer> selectCustomerList(){
        System.out.println("-------------查询客户列表数据------------");
        return null;
    }

    /**
     * 创建图表
     */
    public void createChart(){
        System.out.println("-------------图表创建好了------------");
    }

    /**
     * 展示图表
     */
    public void displayChart(){
        System.out.println("-------------准备展示图表------------");
    }

}
