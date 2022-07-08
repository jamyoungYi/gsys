package com.yi.controller;

import com.yi.pojo.Goods;
import com.yi.pojo.GoodsType;
import com.yi.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {
    @Resource
    @Qualifier("goodsTypeServiceImpl")
    private GoodsTypeService goodsTypeService;

    //查询全部商品类型
    @RequestMapping("/ToGoodsType")
    public String queryAllGoods(HttpSession session){
        List<GoodsType> goodsTypesList = goodsTypeService.queryAllGoodsType();
        System.out.println(goodsTypesList);
        session.setAttribute("goodsTypesList",goodsTypesList);
        System.out.println(goodsTypesList);
        return "redirect:/jsp/splbList.jsp";
    }


    //添加商品类型
    @RequestMapping("/addGoodsType")
    public String addGoodsType(GoodsType goodsType){
        System.out.println("1");
        System.out.println(goodsType);
        int flag = goodsTypeService.addGoodsType(goodsType);
        if (flag==1){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败");
        }
        return "redirect:/goodsType/ToGoodsType";
    }

    //前往修改界面
    @RequestMapping("/toUpdateGoodsType")
    public String toUpdateGoodsType(int id,HttpSession session){
        System.out.println(id);
        GoodsType goodsType = goodsTypeService.findGoodsTypeById(id);
        System.out.println(goodsType);
        session.setAttribute("QGoodsType",goodsType);
        return "redirect:/jsp/splbbj.jsp";
    }
    //修改商品类型
    @RequestMapping("/updateGoodsType")
    public String updateGoodsType(GoodsType goodsType){
        System.out.println(goodsType);
        int flag = goodsTypeService.updateGoodsType(goodsType);
        if (flag==1){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
        return "redirect:/goodsType/ToGoodsType";
    }
    //删除商品类别
    @RequestMapping("/deleteGoodsType")
    public String deleteGoods(int id){
        System.out.println(id);
        int flag = goodsTypeService.deleteGoodsTypeById(id);
        if (flag==1){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败");
        }
        return "redirect:/goodsType/ToGoodsType";
    }
}
