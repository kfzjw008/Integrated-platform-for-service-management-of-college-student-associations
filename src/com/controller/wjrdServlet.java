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

@WebServlet("/wjrd")
public class wjrdServlet extends HttpServlet {


  private static final long serialVersionUID = 1L;

  private static Logger logger = Logger.getLogger(wjrdServlet.class.getName());
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

    request.setAttribute("shetuan", userService.getmyjrshetuan(userid));

    // TODO Auto-generated method stub
    logger.info("Hello马呢");
    //request.setAttribute("students", studentService.getStudents());
    request.getRequestDispatcher("/WEB-INF/JSP/wjrd.jsp").forward(request, response);


  }


}
