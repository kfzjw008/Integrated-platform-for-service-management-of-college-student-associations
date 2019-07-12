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

@WebServlet("/AddstuserServlet")
public class AddstuserServlet extends HttpServlet {//单一注册用户
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private UserService userService = ServiceFactory.getUserService();
	private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取请求参数，调用userService组件完成持久化操作，重定向到ListUserServlet
		//logger.info("clazz:"+Integer.parseInt(request.getParameter("id")));
		int userid=0;
		try {
			userid= Integer.parseInt(request.getSession().getAttribute("userid").toString());
			logger.info(request.getSession().toString());
		}
		catch(NumberFormatException e)
		{//i=0;
		}
		int stid=0;
		try {
			stid=Integer.parseInt(request.getSession().getAttribute("shetuanid").toString());
		}
		catch(NumberFormatException e)
		{//i=0;
		}
		logger.info("clazz:");
	//	int stid= Integer.parseInt(request.getSession().getAttribute("shetuan").toString());
		//request.getSession().getAttribute("shetuan");
		//int js ;js= Integer.parseInt(request.getParameter("jg"));
		userService.userst( userid,stid,1);
		//out.print("<script language='javascript'>alert('666！');window.location.href='index.jsp';</script>");
		JOptionPane.showMessageDialog(null, "社团加入成功！请及时联系负责人缴纳会费");
		response.sendRedirect(request.getContextPath() + "/wjrd");
		return;
	}
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
}
