package com.yi.pojo;
/*
* 入库记录实体类
* */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SupplierOrder {
    //入库订单ID
    private int so_id;
    //供应商ID
    private int s_id;
    //商品ID
    private int g_id;
    //操作类型    进货入库/退货出库
    private String type;
    //商品入库/退货数量
    private int count;
    //操作时间
    private String createTime;
    //备注
    private String remarks;
}
