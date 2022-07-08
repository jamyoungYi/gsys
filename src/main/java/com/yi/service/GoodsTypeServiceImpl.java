package com.yi.service;

import com.yi.dao.GoodsTypeMapper;
import com.yi.pojo.Goods;
import com.yi.pojo.GoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    public void setGoodsTypeMapper(GoodsTypeMapper goodsTypeMapper) {
        this.goodsTypeMapper = goodsTypeMapper;
    }

    public int addGoodsType(GoodsType goodsType) {
        return goodsTypeMapper.addGoodsType(goodsType);
    }

    public int deleteGoodsTypeById(Integer id) {
        return goodsTypeMapper.deleteGoodsTypeById(id);
    }

    public int updateGoodsType(GoodsType goodsType) {
        return goodsTypeMapper.updateGoodsType(goodsType);
    }

    public GoodsType findGoodsTypeById(int id) {
        return goodsTypeMapper.findGoodsTypeById(id);
    }

    public List<GoodsType> queryAllGoodsType() {
        return goodsTypeMapper.queryAllGoodsType();
    }
}
