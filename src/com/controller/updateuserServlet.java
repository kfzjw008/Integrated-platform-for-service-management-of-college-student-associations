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

@WebServlet("/updateuserServlet")
public class updateuserServlet extends HttpServlet {//单一注册用户
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private UserService userService = ServiceFactory.getUserService();
	private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取请求参数，调用userService组件完成持久化操作，重定向到ListUserServlet
		//logger.info("clazz:"+Integer.parseInt(request.getParameter("id")));



		String name = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");
		logger.info(request.getParameter("name"));
		logger.info(request.getParameter("schoolid"));
		logger.info(request.getParameter("mobile"));
		//String schoolid = new String(request.getParameter("schoolid").getBytes("iso-8859-1"), "utf-8");
		String mobile = new String(request.getParameter("mobile").getBytes("iso-8859-1"), "utf-8");
		String college = new String(request.getParameter("college").getBytes("iso-8859-1"), "utf-8");
		String zhuanye = new String(request.getParameter("zhuanye").getBytes("iso-8859-1"), "utf-8");
		String password = new String(request.getParameter("password").getBytes("iso-8859-1"), "utf-8");
int id=Integer.parseInt(request.getSession().getAttribute("userid").toString());
		//int js ;js= Integer.parseInt(request.getParameter("jg"));
		userService.updateUserss( id,name ,  mobile,college,zhuanye,password);
		//out.print("<script language='javascript'>alert('666！');window.location.href='index.jsp';</script>");
		//JOptionPane.showMessageDialog(null, "资料修改成功！");
		//request.getSession().setAttribute("userid", user.getId());
		//request.getSession().setAttribute("userxh", user.getUserName());
		//request.getSession().setAttribute("userpower", user.getPower());
		request.getSession().setAttribute("username", name);
		request.getSession().setAttribute("usersj", mobile);
		//request.getSession().setAttribute("usersex", user.getSex());
		request.getSession().setAttribute("usercollege", college);
		request.getSession().setAttribute("userzhuanye", zhuanye);
		request.getSession().setAttribute("userp", password);
		response.sendRedirect(request.getContextPath() + "/ziliaoxiugai");
		return;
	}
	private static final long serialVersionUID = 1L;
}
