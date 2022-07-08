package com.yi.service;

import com.yi.pojo.User;

import java.util.List;

public interface UserService {
    //登录账号密码查询
    public User isLogin(String username,String password);
    //注册账号
    public int register(User user);
    //销毁账号
    public int deleteUserByUsername(String username);
    //修改密码
    public int updateUser(User user);
    //根据id查询用户
    public User findUserById(int id);
    //查询所有用户
    public List<User> findAll();
}
