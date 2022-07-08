package com.yi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//供应商实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Supplier {
    //供应商ID
    private int s_id;
    //供应商名称
    private String s_name;
    //联系人
    private String contacts;
    //联系电话
    private String phone;
    //地址
    private String address;
    //备注
    private String remarks;

}
