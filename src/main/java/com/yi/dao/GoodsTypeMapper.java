package com.yi.dao;

import com.yi.pojo.Goods;
import com.yi.pojo.GoodsType;

import java.util.List;

public interface GoodsTypeMapper {
    //增加商品类型
    public int addGoodsType(GoodsType goodsType);
    //删除商品类型
    public int deleteGoodsTypeById(Integer id);
    //更新商品类型信息
    public int updateGoodsType(GoodsType goodsType);
    //查询一个商品类型
    public GoodsType findGoodsTypeById(int id);
    //查询所有商品类型
    List<GoodsType> queryAllGoodsType();
}
