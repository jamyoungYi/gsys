package com.yi.controller;

import com.yi.pojo.Customer;
import com.yi.pojo.CustomerOrder;
import com.yi.pojo.Goods;
import com.yi.pojo.Supplier;
import com.yi.service.CustomerOrderServiceImpl;
import com.yi.service.CustomerServiceImpl;
import com.yi.service.GoodsServiceImpl;
import com.yi.service.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/customerOrder")
public class CustomerOrderController {
    @Resource
    @Qualifier("customerOrderServiceImpl")
    private CustomerOrderServiceImpl customerOrderService;

    @Resource
    @Qualifier("goodsServiceImpl")
    private GoodsServiceImpl goodsService;

    @Resource
    @Qualifier("customerServiceImpl")
    private CustomerServiceImpl customerService;
    //查询全部商品和供应商并跳转页面
    @RequestMapping("/SalesIssue")
    public String SalesIssue(HttpSession session){
        List<Goods> goodsList = goodsService.queryAllGoods();
//        System.out.println(goodsList);
        List<Customer> customerList = customerService.queryAllCustomer();
//        System.out.println(suppliersList);\\\
        session.setAttribute("goodsList",goodsList);
        session.setAttribute("customerList",customerList);
        return "redirect:/jsp/xxck.jsp";
    }

    //商品销售出库
    @RequestMapping("/goodsWarehousing")
    public String addGoods(CustomerOrder customerOrder, HttpSession session){
        System.out.println(customerOrder);
        Goods addGoods = goodsService.findGoodsById(customerOrder.getG_id());
        System.out.println(addGoods.getCount());
        System.out.println(customerOrder.getCount());
        addGoods.setCount(addGoods.getCount() - customerOrder.getCount());
        goodsService.updateGoods(addGoods);
        customerOrderService.addCustomerOrder(customerOrder);
        return "redirect:/goods/ToGoods";
    }
}
