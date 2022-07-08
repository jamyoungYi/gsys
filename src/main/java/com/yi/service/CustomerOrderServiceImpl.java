package com.yi.service;

import com.yi.dao.CustomerOrderMapper;
import com.yi.pojo.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    private CustomerOrderMapper customerOrderMapper;

    public void setCustomerOrderMapper(CustomerOrderMapper customerOrderMapper) {
        this.customerOrderMapper = customerOrderMapper;
    }

    public int addCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderMapper.addCustomerOrder(customerOrder);
    }
}
