package com.yi.dao;

import com.yi.pojo.Revenue;

import java.util.List;

public interface RevenueMapper {
    //查看月营收统计
    public List<Revenue> findMonthRevenue();
}
