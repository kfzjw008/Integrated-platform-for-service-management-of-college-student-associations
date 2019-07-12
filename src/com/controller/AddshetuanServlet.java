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

@WebServlet("/AddshetuanServlet")
public class AddshetuanServlet extends HttpServlet {//单一注册用户
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private UserService userService = ServiceFactory.getUserService();
	private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取请求参数，调用userService组件完成持久化操作，重定向到ListUserServlet
		//logger.info("clazz:"+Integer.parseInt(request.getParameter("id")));


		int id=0;
		try {id=Integer.parseInt(request.getParameter("id"));
		}
		catch(NumberFormatException e)
		{//i=0;
		}
		String name = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");
		logger.info(request.getParameter("name"));
		String teacher = new String(request.getParameter("teacher").getBytes("iso-8859-1"), "utf-8");
		String intention = new String(request.getParameter("intention").getBytes("iso-8859-1"), "utf-8");
		String item = new String(request.getParameter("item").getBytes("iso-8859-1"), "utf-8");
		String wechat = new String(request.getParameter("wechat").getBytes("iso-8859-1"), "utf-8");
		String telephone = new String(request.getParameter("telephone").getBytes("iso-8859-1"), "utf-8");
		int ys=0;
		try {ys=Integer.parseInt(request.getParameter("ys"));
		}
		catch(NumberFormatException e)
		{//i=0;
		}
		int js=0;
		try {js=Integer.parseInt(request.getParameter("jg"));
		}
		catch(NumberFormatException e)
		{//i=0;
		}
		//int js ;js= Integer.parseInt(request.getParameter("jg"));
		userService.addshetuan( id,name , teacher, intention,item, wechat, telephone, ys, js);
		//out.print("<script language='javascript'>alert('666！');window.location.href='index.jsp';</script>");
		JOptionPane.showMessageDialog(null, "社团创建申请提交成功！我们会在三日内联系你并通过手机告知你申请结果，请保持联络畅通并在三日内将社团纸质版材料上交到社团联合会办公室。逾期未交视为放弃申请。");
		response.sendRedirect(request.getContextPath() + "/home");
		return;
	}
	private static final long serialVersionUID = 1L;
}
