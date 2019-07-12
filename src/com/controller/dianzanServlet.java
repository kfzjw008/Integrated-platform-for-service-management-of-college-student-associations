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

@WebServlet("/dianzanServlet")
public class dianzanServlet extends HttpServlet {//单一注册用户
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private UserService userService = ServiceFactory.getUserService();
	private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取请求参数，调用userService组件完成持久化操作，重定向到ListUserServlet
		//logger.info("clazz:"+Integer.parseInt(request.getParameter("id")));


		return;
	}
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		int id=0;
		try {id=Integer.valueOf(request.getParameter("uid"));
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
		userService.updateliuyan(id);


		//out.print("<script language='javascript'>alert('666！');window.location.href='index.jsp';</script>");
		JOptionPane.showMessageDialog(null, "点赞成功！");




		id=0;
		try {id=Integer.valueOf(String.valueOf(request.getSession().getAttribute("shetuanid")));
		}
		catch(NumberFormatException e)
		{//i=0;
		}

		request.setAttribute("users", userService.getmyjrshetuanuser(id));
		//SELECT  DISTINCT userid,stid,power,2power FROM usershetuan   ;
		//request.getSession().setAttribute("shetuan", userService.get1st(id));
		//request.getSession().setAttribute("shetuanid", userService.get1st(id).getId());
		//request.getSession().setAttribute("shetuanname", userService.get1st(id).getName());
		logger.info(String.valueOf(request.getSession().getAttribute("shetuanid")));
		logger.info(String.valueOf(request.getSession().getAttribute("shetuanname")));
		logger.info(String.valueOf(request.getSession().getAttribute("userid")));
		request.setAttribute("shetuan", userService.get1st(id));
		request.setAttribute("liuyan", userService.getliuyan(id));
		request.getSession().getAttribute("user");
		request.getSession().getAttribute("userid");
			request.getRequestDispatcher("/WEB-INF/JSP/stdail2.jsp").forward(request, response);
			return;



	}
}
