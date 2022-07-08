package com.yi.controller;

import com.yi.pojo.Goods;
import com.yi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    //调用service层
    @Resource
    @Qualifier("goodsServiceImpl")
    private GoodsService goodsService;

    //查询全部商品并且返回到商品展示页面
    @RequestMapping("/ToGoods")
    public String queryAllGoods(HttpSession session){
        List<Goods> goodsList = goodsService.queryAllGoods();
        session.setAttribute("goodsList",goodsList);
        System.out.println(goodsList);
        return "redirect:/jsp/spgl.jsp";
    }

    //添加商品
    @RequestMapping("/addGoods")
    public String addGoods(Goods goods,MultipartFile imgFile,HttpServletRequest request) throws IOException {
        System.out.println(goods);
        String originalFilename = imgFile.getOriginalFilename();
        if (!originalFilename.equals("")){
            String ext = originalFilename.substring(originalFilename.lastIndexOf("."));//.jpg
            String fileName = System.currentTimeMillis()+ext;

            //2.获取img目录的路径
            String dir = request.getServletContext().getRealPath("images");
            String savePath = dir + "/" +fileName;

            //3.保存文件
            imgFile.transferTo(new File(savePath));
            //4.将图片的访问路径设置保存到goods对象
            goods.setPic("images/"+fileName);
        }
        System.out.println("处理过后的goods"+goods);
        goodsService.addGoods(goods);
        return "redirect:/goods/ToGoods";
    }

    //删除商品
    @RequestMapping("/deleteGoods")
    public String deleteGoods(int id){
        System.out.println(id);
        int flag = goodsService.deleteGoodsById(id);
        if (flag==1){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败");
        }
        return "redirect:/goods/ToGoods";
    }
    //前往编辑页面
    @RequestMapping("/toUpdate")
    public String toUpdate(Integer id,HttpSession session){
        System.out.println(id);
        Goods goods = goodsService.findGoodsById(id);
        System.out.println(goods);
        session.setAttribute("QGoods",goods);
        return "redirect:/jsp/spbj.jsp";
    }
    //编辑商品信息
    @RequestMapping("/updateGoods")
    public String updateGoods(Goods goods,MultipartFile imgFile,HttpServletRequest request) throws IOException {
        Goods goodsT = goodsService.findGoodsById(goods.getId());
        //1,截取上传文件的后缀名
        goods.setPic(goodsT.getPic());
        String originalFilename = imgFile.getOriginalFilename();
        if (!originalFilename.equals("")){
            String ext = originalFilename.substring(originalFilename.lastIndexOf("."));//.jpg
            String fileName = System.currentTimeMillis()+ext;

            //2.获取img目录的路径
            String dir = request.getServletContext().getRealPath("images");
            String savePath = dir + "/" +fileName;

            //3.保存文件
            imgFile.transferTo(new File(savePath));
            //4.将图片的访问路径设置保存到goods对象
            goods.setPic("images/"+fileName);
        }
        int flag = goodsService.updateGoods(goods);
        if (flag>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
        return "redirect:/goods/ToGoods";
    }

    //模糊查询
    @RequestMapping("/findByNameGoodsLike")
    public String findByNameGoodsLike(HttpSession session,String g_name){
        System.out.println(g_name);
        List<Goods> goodsList = goodsService.findByNameGoodsLike(g_name);
        System.out.println(goodsList);
        session.setAttribute("goodsList",goodsList);
        return "redirect:/jsp/spgl.jsp";
    }
    //查看商品页面
    @RequestMapping("/toSee")
    public String toSee(Integer id,HttpSession session){
        System.out.println(id);
        Goods goods = goodsService.findGoodsById(id);
        System.out.println(goods);
        session.setAttribute("QGoods",goods);
        return "redirect:/jsp/spxx.jsp";
    }
}
