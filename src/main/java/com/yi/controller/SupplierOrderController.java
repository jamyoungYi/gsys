package com.yi.controller;

import com.yi.pojo.Goods;
import com.yi.pojo.Supplier;
import com.yi.pojo.SupplierOrder;
import com.yi.service.GoodsServiceImpl;
import com.yi.service.SupplierServiceImpl;
import com.yi.service.SupplierOrderServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/warehousing")
public class SupplierOrderController {
    //调用Service层
    @Resource
    @Qualifier("goodsServiceImpl")
    private GoodsServiceImpl goodsService;

    @Resource
    @Qualifier("supplierServiceImpl")
    private SupplierServiceImpl supplierService;

    @Resource
    @Qualifier("supplierOrderServiceImpl")
    private SupplierOrderServiceImpl supplierOrderService;

    //跳转入库页面
    @RequestMapping("/StockIn")
    public String StockIn(HttpSession session){
        List<Goods> goodsList = goodsService.queryAllGoods();
//        System.out.println(goodsList);
        List<Supplier> suppliersList = supplierService.queryAllSupplier();
//        System.out.println(suppliersList);\\\
        session.setAttribute("goodsList",goodsList);
        session.setAttribute("suppliersList",suppliersList);
        return "redirect:/jsp/jhrk.jsp";
    }

    //商品入库
    @RequestMapping("/supplierOrder")
    public String addGoods(SupplierOrder supplierorder, HttpSession session){
        System.out.println(supplierorder);

        Goods addGoods = goodsService.findGoodsById(supplierorder.getG_id());
        addGoods.setCount(addGoods.getCount() + supplierorder.getCount());
        goodsService.updateGoods(addGoods);
        supplierOrderService.addSupplierOrder(supplierorder);
        return "redirect:/goods/ToGoods";
    }
    //跳转出库页面
    @RequestMapping("/toReturnGoods")
    public String toReturnGoods(HttpSession session){
        List<Goods> goodsList = goodsService.queryAllGoods();
//        System.out.println(goodsList);
        List<Supplier> suppliersList = supplierService.queryAllSupplier();
//        System.out.println(suppliersList);\\\
        session.setAttribute("goodsList",goodsList);
        session.setAttribute("suppliersList",suppliersList);
        return "redirect:/jsp/thck.jsp";
    }

    //商品入库
    @RequestMapping("/ReturnGoods")
    public String ReturnGoods(SupplierOrder supplierorder, HttpSession session){
        System.out.println(supplierorder);

        Goods addGoods = goodsService.findGoodsById(supplierorder.getG_id());
        addGoods.setCount(addGoods.getCount() - supplierorder.getCount());
        goodsService.updateGoods(addGoods);
        supplierOrderService.addSupplierOrder(supplierorder);
        return "redirect:/goods/ToGoods";
    }
}
