package com.yi.interceptor;

import com.yi.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("thisUser");
        if (user==null){
            String url = request.getContextPath()+"/jsp/login.jsp";
            System.out.println(url);
            response.sendRedirect(url);
            return false;
        }
        return true;
    }
}
