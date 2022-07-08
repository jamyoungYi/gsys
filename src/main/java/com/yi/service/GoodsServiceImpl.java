package com.yi.service;

import com.yi.dao.GoodsMapper;
import com.yi.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    //service层调用dao层：组合Dao
    @Autowired
    private GoodsMapper goodsMapper;

    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    public int addGoods(Goods goods) {
        return goodsMapper.addGoods(goods);
    }

    public int deleteGoodsById(int id) {
        return goodsMapper.deleteGoodsById(id);
    }

    public int updateGoods(Goods goods) {
        return goodsMapper.updateGoods(goods);
    }

    public Goods findGoodsById(int id) {
        return goodsMapper.findGoodsById(id);
    }

    public List<Goods> queryAllGoods() {
        return goodsMapper.queryAllGoods();
    }

    public List<Goods> findByNameGoodsLike(String name) {
        return goodsMapper.findByNameGoodsLike(name);
    }
}
