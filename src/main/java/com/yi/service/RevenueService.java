package com.yi.service;

import com.yi.pojo.Revenue;

import java.util.List;

public interface RevenueService {
    //查看月营收统计
    public List<Revenue> findMonthRevenue();
}
