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

@WebServlet("/updateshetuanServlet")
public class updateshetuanServlet extends HttpServlet {//单一注册用户
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private UserService userService = ServiceFactory.getUserService();
	private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teacher = new String(request.getParameter("teacher").getBytes("iso-8859-1"), "utf-8");
		logger.info(request.getParameter("teacher"));
		//logger.info(request.getParameter("schoolid"));
		//logger.info(request.getParameter("mobile"));
		//String schoolid = new String(request.getParameter("schoolid").getBytes("iso-8859-1"), "utf-8");
		String item = new String(request.getParameter("shetuan.item").getBytes("iso-8859-1"), "utf-8");
		String intention = new String(request.getParameter("intention").getBytes("iso-8859-1"), "utf-8");
		String wechat = new String(request.getParameter("wechat").getBytes("iso-8859-1"), "utf-8");
		String telephone = new String(request.getParameter("telephone").getBytes("iso-8859-1"), "utf-8");
		int id=Integer.parseInt(request.getSession().getAttribute("shetuanid").toString());
		//int js ;js= Integer.parseInt(request.getParameter("jg"));
		userService.updateshetuan( id,teacher,item,intention,wechat,telephone);
		request.getSession().setAttribute("shetuan", userService.get1st(id));
		request.getSession().setAttribute("shetuanid", userService.get1st(id).getId());
		request.getSession().setAttribute("shetuanname", userService.get1st(id).getName());
		logger.info(String.valueOf(request.getSession().getAttribute("shetuanid")));
		logger.info(String.valueOf(request.getSession().getAttribute("shetuanname")));
		logger.info(String.valueOf(request.getSession().getAttribute("userid")));
		request.setAttribute("shetuan", userService.get1st(id));
		request.getSession().getAttribute("user");
		request.getSession().getAttribute("userid");
		request.setAttribute("users", userService.getmyjrshetuanuser(id));
		JOptionPane.showMessageDialog(null, "社团资料修改成功！");
		response.sendRedirect(request.getContextPath() + "/wgld");
		return;
	}
	private static final long serialVersionUID = 1L;
}
