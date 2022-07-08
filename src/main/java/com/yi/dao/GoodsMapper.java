package com.yi.dao;

import com.yi.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    //增加商品
    int addGoods(Goods goods);
    //删除商品
    int deleteGoodsById(Integer id);
    //更新商品信息
    int updateGoods(Goods goods);
    //查询一个商品
    Goods findGoodsById(int id);
    //查询所有商品
    List<Goods> queryAllGoods();
    //根据商品名进行模糊查询
    List<Goods> findByNameGoodsLike(String name);
}
