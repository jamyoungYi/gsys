package com.yi.controller;

import com.yi.pojo.Revenue;
import com.yi.service.RevenueServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/revenue")
public class RevenueController {
    @Resource
    @Qualifier("revenueServiceImpl")
    private RevenueServiceImpl revenueService;
    @RequestMapping("toYyslList")
    public String toYyslList(HttpSession session){
        List<Revenue> monthRevenueList = revenueService.findMonthRevenue();
        System.out.println(monthRevenueList);
        session.setAttribute("monthRevenueList",monthRevenueList);
        return "redirect:/jsp/yysList.jsp";
    }
}
