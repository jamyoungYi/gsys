package com.yi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
/*
* 出库记录表实体类
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerOrder {
    //出库记录ID
    private int co_id;
    //出库记录ID
    private int c_id;
    //出库记录ID
    private int g_id;
    //
    private String type;
    //商品出库数量
    private int count;
    //供应商ID
    private String createTime;
    //备注
    private String remarks;

}
