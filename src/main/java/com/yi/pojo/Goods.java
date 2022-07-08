package com.yi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
* 商品信息实体类
* xxx
* */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Goods {
    //商品ID
    private int id;
    //商品名称
    private String g_name;
    //商品类别
    private String type;
    //商品数量
    private int count;
    //商品进价价格
    private double buyprice;
    //商品出售价格
    private double price;
    //商品制造商
    private String manufacturer;
    //商品类别ID
    private int lbid;
    //商品图片
    private String pic;
}
