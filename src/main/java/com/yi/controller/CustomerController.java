package com.yi.controller;

import com.yi.pojo.Customer;
import com.yi.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    @Qualifier("customerServiceImpl")
    private CustomerServiceImpl customerService;

    //跳转到查询全部客户信息页面
    @RequestMapping("/toCustomer")
    public String toCustomer(HttpSession session){
        List<Customer> customersList = customerService.queryAllCustomer();
        System.out.println(customersList);
        session.setAttribute("customersList",customersList);
        return "redirect:/jsp/khList.jsp";
    }

    //添加客户
    @RequestMapping("/addCustomer")
    public String addGoodsType(Customer customer){
        System.out.println(customer);
        int flag = customerService.insertCustomer(customer);
        if (flag==1){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败");
        }
        return "redirect:/customer/toCustomer";
    }
    //前往编辑页面
    @RequestMapping("/toUpdateCustomer")
    public String toUpdateCustomer(Integer id,HttpSession session){
        System.out.println(id);
        Customer customer = customerService.queryCustomerById(id);
        System.out.println(customer);
        session.setAttribute("QCustomer",customer);
        return "redirect:/jsp/kh.jsp";
    }
    //修改客户信息
    @RequestMapping("/updateGoods")
    public String updateGoods(Customer customer){
        System.out.println(customer);
        int flag = customerService.updateCustomer(customer);
        if (flag>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
        return "redirect:/customer/toCustomer";
    }
    //删除客户信息
    @RequestMapping("/deleteCustomer")
    public String deleteCustomer(int id){
        System.out.println(id);
        int flag = customerService.deleteCustomerById(id);
        if (flag>0){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
        return "redirect:/customer/toCustomer";
    }
    //根据客户名和联系人模糊查询
    @RequestMapping("/findByNameAndByContactCustomerLike")
    public String findByNameAndByContactCustomerLike(String name,String contacts,HttpSession session){
        System.out.println(name);
        System.out.println(contacts);
        List<Customer> list = customerService.findByNameAndByContactCustomerLike(name, contacts);
        System.out.println(list);
        session.setAttribute("customersList",list);
        return "redirect:/jsp/khList.jsp";
    }
}
