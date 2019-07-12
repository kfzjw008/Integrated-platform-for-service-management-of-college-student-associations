package com.controller;
import com.entity.Usereee;
import com.service.Usereeeservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/htindexServlet")
public class htindexServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
    private Usereeeservice userService = new Usereeeservice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // 获取post传入的参数
        logger.info("1");
        logger.info("Hello Servlet后台 post方法");
        String userName = request.getParameter("username");
        logger.info("2");
        String password = request.getParameter("password");
        logger.info("3");
        logger.info("name是：" +userName);
        logger.info("4");
        // 由业务逻辑层组件处理具体的业务逻辑，serlvet不负责验证处理
        Usereee user =new Usereee();
        user=userService.getUser(userName, password);
        logger.info("5");
        String redPath = "/index";
        logger.info("6");
        // 用户存在，置于session，跳转到welcome
        if (user != null) {
            logger.info("7");
            logger.info("用户存在，置于session，跳转到welcome");
            request.getSession().setAttribute("user", user);
            request.getSession().setAttribute("userid", user.getId());
            request.getSession().setAttribute("userxh", user.getUserName());
            request.getSession().setAttribute("userpower", user.getPower());
            request.getSession().setAttribute("username", user.getName());
            request.getSession().setAttribute("usersj", user.getMobile());
            request.getSession().setAttribute("usersex", user.getSex());
            request.getSession().setAttribute("usercollege", user.getCollege());
            request.getSession().setAttribute("userzhuanye", user.getZhuanye());
            request.getSession().setAttribute("userp", user.getPassword());
            logger.info(String.valueOf(user.getId()));
            redPath = "/home";
            logger.info("9");
            if(user.getPower()==1)redPath="/admin";
        }else{
            JOptionPane.showMessageDialog(null, "账号或密码错误！");
        }

        // 不存在则跳转到login
        logger.info("redpath："+redPath);
        logger.info("conpath："+request.getContextPath());
        response.sendRedirect(request.getContextPath() + redPath);
        logger.info("8");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
        logger.info("Hello Servlet后台 get方法");
        //request.setAttribute("students", studentService.getStudents());

        request.getRequestDispatcher("/WEB-INF/JSP/ht/index.jsp").forward(request, response);

    }
}
