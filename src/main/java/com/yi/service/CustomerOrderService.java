package com.yi.service;

import com.yi.pojo.CustomerOrder;

public interface CustomerOrderService {
    //添加出库记录
    public int addCustomerOrder(CustomerOrder customerOrder);
}
