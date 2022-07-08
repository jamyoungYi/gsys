package com.yi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    //用户ID
    private int id;
    //用户名
    private String username;
    //密码
    private String password;
    //头像
    private String pic;
}
