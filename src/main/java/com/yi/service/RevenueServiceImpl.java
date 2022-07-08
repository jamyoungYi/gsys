package com.yi.service;

import com.yi.dao.RevenueMapper;
import com.yi.pojo.Revenue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RevenueServiceImpl implements RevenueService {
    @Autowired
    private RevenueMapper revenueMapper;

    public void setRevenueMapper(RevenueMapper revenueMapper) {
        this.revenueMapper = revenueMapper;
    }

    public List<Revenue> findMonthRevenue() {
        return revenueMapper.findMonthRevenue();
    }
}
