package com.yi.dao;

import com.yi.pojo.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
public interface CustomerMapper {
    //增加客户
    public int insertCustomer(Customer customer);
    //删除客户
    public int deleteCustomerById(int id);
    //更新客户
    public int updateCustomer(Customer customer);
    //获取所有客户
    public List<Customer> queryAllCustomer();
    //根据客户ID查询客户信息
    public Customer queryCustomerById(int id);
    //根据客户名模糊查询客户
    public List<Customer> findByNameCustomerLike(String name);
    //根据客户名和联系人模糊查询
    public List<Customer> findByNameAndByContactCustomerLike(@Param("c_name") String name,@Param("contacts") String contacts);
}
