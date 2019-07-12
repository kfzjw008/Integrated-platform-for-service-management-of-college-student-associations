package com.controller;

import com.service.ServiceFactory;
import com.service.StudentService;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/wgld")
public class wgldServlet extends HttpServlet {


  private static final long serialVersionUID = 1L;

  private static Logger logger = Logger.getLogger(wgldServlet.class.getName());
  StudentService studentService = new StudentService();

  private UserService userService = ServiceFactory.getUserService();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    int userid=0;
    try {
      userid= Integer.parseInt(request.getSession().getAttribute("userid").toString());
      logger.info(request.getSession().toString());
    }
    catch(NumberFormatException e)
    {//i=0;
    }
    request.setAttribute("shetuan", userService.getmyglshetuan(userid));
    // TODO Auto-generated method stub
    logger.info("Hello Servlet你说你马呢");
    //request.setAttribute("students", studentService.getStudents());
    request.getRequestDispatcher("/WEB-INF/JSP/wgld.jsp").forward(request, response);


  }


}
