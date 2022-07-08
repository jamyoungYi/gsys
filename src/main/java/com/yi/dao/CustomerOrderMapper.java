package com.yi.dao;

import com.yi.pojo.CustomerOrder;

public interface CustomerOrderMapper {
    //添加出库记录
    public int addCustomerOrder(CustomerOrder customerOrder);
}
