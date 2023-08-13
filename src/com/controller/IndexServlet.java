package com.controller;

import com.entity.Usereee;
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

@WebServlet("/index")
public class IndexServlet extends HttpServlet {


  private static final long serialVersionUID = 1L;

  private static Logger logger = Logger.getLogger(IndexServlet.class.getName());
  StudentService studentService = new StudentService();

  private UserService userService = ServiceFactory.getUserService();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    request.setAttribute("students", userService.listUsers());
    // TODO Auto-generated method stub
    logger.info("Hello Servlet你说你马呢");
    Usereee user = new Usereee();
    //request.setAttribute("students", studentService.getStudents());
    request.getSession().invalidate();
    request.getRequestDispatcher("/WEB-INF/JSP/index.jsp").forward(request, response);
    return;
  }
}
