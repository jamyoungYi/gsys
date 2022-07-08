package com.yi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoodsType {
    //商品类别ID
    private int id;
    //商品类别名称
    private String t_name;
}
