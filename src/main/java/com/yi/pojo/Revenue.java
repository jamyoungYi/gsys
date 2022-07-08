package com.yi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Revenue {
    //销售总额
    private double shze;
    //退货总额
    private double thze;
    //入库总额
    private double rkze;
    //出库总额
    private double ckze;
    //盈亏总额
    private double ykze;
    //创建日期
    private String createTime;
}
