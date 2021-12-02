package com.example.demo.principle.srp.Positive;

import com.example.demo.domain.Customer;

import java.util.List;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 09:59:34
 * @Description 负责客户的curd管理
 */
public class CustomerDao {
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

}
