package com.yi.pojo;
/*
* 客户实体类
* */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    //顾客ID
    private int c_id;
    //顾客名称
    private String c_name;
    //联系人
    private String contacts;
    //联系电话
    private String phone;
    //地址
    private String address;
    //备注
    private String remarks;
}
