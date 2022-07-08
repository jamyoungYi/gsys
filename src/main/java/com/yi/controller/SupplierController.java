package com.yi.controller;

import com.yi.pojo.Supplier;
import com.yi.service.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Resource
    @Qualifier("supplierServiceImpl")
    private SupplierServiceImpl supplierService;

    //跳转到查询全部供应商信息页面
    @RequestMapping("/toSupplier")
    public String toSupplier(HttpSession session){
        List<Supplier> supplierList = supplierService.queryAllSupplier();
        System.out.println(supplierList);
        session.setAttribute("supplierList",supplierList);
        return "redirect:/jsp/gysList.jsp";
    }
    //添加供应商
    @RequestMapping("/addSupplier")
    public String addSupplier(Supplier supplier){
        System.out.println(supplier);
        int flag = supplierService.insertSupplier(supplier);
        if (flag==1){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败");
        }
        return "redirect:/supplier/toSupplier";
    }
    //前往修改页面
    @RequestMapping("/toUpdateCustomer")
    public String toUpdateSupplier(Integer id,HttpSession session){
        System.out.println(id);
        Supplier supplier = supplierService.querySupplierById(id);
        System.out.println(supplier);
        session.setAttribute("QSupplier",supplier);
        return "redirect:/jsp/gys.jsp";
    }
    //修改供应商信息
    @RequestMapping("/updateSupplier")
    public String updateSupplier(Supplier supplier){
        System.out.println(supplier);
        int flag = supplierService.updateSupplier(supplier);
        if (flag>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
        return "redirect:/supplier/toSupplier";
    }
    //删除客户信息
    @RequestMapping("/deleteSupplier")
    public String deleteSupplier(int id){
        System.out.println(id);
        int flag = supplierService.deleteSupplierById(id);
        if (flag>0){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
        return "redirect:/supplier/toSupplier";
    }
    //模糊查询
    @RequestMapping("/findByNameAndByContactSupplierLike")
    public String findByNameAndByContactSupplierLike(String name,String contacts,HttpSession session){
        System.out.println(name);
        System.out.println(contacts);
        List<Supplier> list = supplierService.findByNameAndByContactSupplierLike(name, contacts);
        System.out.println(list);
        session.setAttribute("supplierList",list);
        return "redirect:/jsp/gysList.jsp";
    }
}
