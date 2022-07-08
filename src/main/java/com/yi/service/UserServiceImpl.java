package com.yi.service;

import com.yi.dao.UserMapper;
import com.yi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User isLogin(String username, String password) {
        return userMapper.isLogin(username,password);
    }

    public int register(User user) {
        return userMapper.register(user);
    }

    public int deleteUserByUsername(String username) {
        return userMapper.deleteUserByUsername(username);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
