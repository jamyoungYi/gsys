package com.yi.controller;

import com.yi.pojo.User;
import com.yi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    @Qualifier("userServiceImpl")
    private UserServiceImpl userService;

    //跳转到用户管理界面
    @RequestMapping("/toUser")
    public String toUser(HttpSession request){
        List<User> userList = userService.findAll();
        System.out.println(userList);
        request.setAttribute("userList",userList);
        return "redirect:/jsp/userList.jsp";
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "redirect:/jsp/index.jsp";
    }

    //登录判断
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        User user = userService.isLogin(username,password);
        System.out.println(user);
        if (user==null){
            return "redirect:/jsp/login.jsp";
        }else {
            session.setAttribute("thisUser",user);
            System.out.println("登录成功");
            return "redirect:/user/toIndex";
        }

    }
    //用户注销
    @RequestMapping("/cancellation")
    public String cancellation(HttpSession session){
        session.removeAttribute("thisUser");
        return "redirect:/jsp/login.jsp";
    }
    //前往编辑页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,HttpSession session){
        System.out.println(id);
        User userList = userService.findUserById(id);
        session.setAttribute("QUserList",userList);
        return "redirect:/jsp/userUpdate.jsp";
    }
    //更改用户密码
    @RequestMapping("/updateUser")
    public String updateUser(User user, MultipartFile imgFile,HttpServletRequest request) throws IOException {
        System.out.println(user);
        System.out.println(imgFile);
        user.setPic(user.getPic());
        String originalFilename = imgFile.getOriginalFilename();
        if (!originalFilename.equals("")){
            String ext = originalFilename.substring(originalFilename.lastIndexOf("."));//.jpg
            String fileName = System.currentTimeMillis()+ext;

            //2.获取img目录的路径
            String dir = request.getServletContext().getRealPath("images");
            String savePath = dir + "/" +fileName;

            //3.保存文件
            imgFile.transferTo(new File(savePath));
            //4.将图片的访问路径设置保存到goods对象
            user.setPic("images/"+fileName);
        }
        userService.updateUser(user);
        return "redirect:/user/toUser";
    }
    //添加用户
    @RequestMapping("/addUser")
    public String addUser(User user,MultipartFile imgFile,HttpServletRequest request) throws IOException {
        System.out.println(user);
        String originalFilename = imgFile.getOriginalFilename();
        if (!originalFilename.equals("")){
            String ext = originalFilename.substring(originalFilename.lastIndexOf("."));//.jpg
            String fileName = System.currentTimeMillis()+ext;

            //2.获取img目录的路径
            String dir = request.getServletContext().getRealPath("images");
            String savePath = dir + "/" +fileName;

            //3.保存文件
            imgFile.transferTo(new File(savePath));
            //4.将图片的访问路径设置保存到goods对象
            user.setPic("images/"+fileName);
        }

        userService.register(user);
        return "redirect:/user/ToUser";
    }
}
