package com.yi.service;

import com.yi.dao.CustomerMapper;
import com.yi.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public int insertCustomer(Customer customer) {
        return customerMapper.insertCustomer(customer);
    }

    public int deleteCustomerById(int id) {
        return customerMapper.deleteCustomerById(id);
    }

    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    public List<Customer> queryAllCustomer() {
        return customerMapper.queryAllCustomer();
    }

    public Customer queryCustomerById(int id) {
        return customerMapper.queryCustomerById(id);
    }

    public List<Customer> findByNameCustomerLike(String name) {
        return customerMapper.findByNameCustomerLike(name);
    }

    public List<Customer> findByNameAndByContactCustomerLike(String name, String contact) {
        return customerMapper.findByNameAndByContactCustomerLike(name,contact);
    }

}
