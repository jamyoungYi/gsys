package com.yi.service;

import com.yi.pojo.Goods;
import com.yi.pojo.GoodsType;

import java.util.List;

public interface GoodsTypeService {
    //增加商品类型
    public int addGoodsType(GoodsType goodsType);
    //删除商品类型
    int deleteGoodsTypeById(Integer id);
    //更新商品类型信息
    int updateGoodsType(GoodsType goodsType);
    //查询一个商品类型
    GoodsType findGoodsTypeById(int id);
    //查询所有商品类型
    List<GoodsType> queryAllGoodsType();
}
