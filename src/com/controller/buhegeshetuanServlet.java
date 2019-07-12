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

@WebServlet("/buhegeshetuan")
public class buhegeshetuanServlet extends HttpServlet {


  private static final long serialVersionUID = 1L;

  private static Logger logger = Logger.getLogger(buhegeshetuanServlet.class.getName());
  StudentService studentService = new StudentService();

  private UserService userService = ServiceFactory.getUserService();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    request.setAttribute("students", userService.listUsers());
    // TODO Auto-generated method stub
    logger.info("Hello Servlet你说你马呢");
    //request.setAttribute("students", studentService.getStudents());
    request.setAttribute("shetuan", userService.getshetuan3());
    request.getRequestDispatcher("/WEB-INF/JSP/buhegeshetuan.jsp").forward(request, response);


  }


}
