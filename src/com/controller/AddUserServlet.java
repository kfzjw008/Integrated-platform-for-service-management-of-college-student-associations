package com.controller;

import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.logging.Logger;

import static java.lang.System.out;

@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {//单一注册用户
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private UserService userService = ServiceFactory.getUserService();
	private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取请求参数，调用userService组件完成持久化操作，重定向到ListUserServlet
		String schoolid = new String(request.getParameter("schoolid").getBytes("iso-8859-1"), "utf-8");
		logger.info("clazz:"+schoolid);

	    
		userService.addUsers(schoolid);
		//out.print("<script language='javascript'>alert('666！');window.location.href='index.jsp';</script>");
		//JOptionPane.showMessageDialog(null, "注册成功！初始密码与账号相同");//swing
		response.sendRedirect(request.getContextPath() + "/index");
		return;
	}
	private static final long serialVersionUID = 1L;
}
