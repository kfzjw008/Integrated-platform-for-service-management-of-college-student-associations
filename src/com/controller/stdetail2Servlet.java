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

@WebServlet("/stdetail2Servlet")
public class stdetail2Servlet extends HttpServlet {


  private static final long serialVersionUID = 1L;

  private static Logger logger = Logger.getLogger(stdetail2Servlet.class.getName());
  StudentService studentService = new StudentService();

  private UserService userService = ServiceFactory.getUserService();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     // HttpServletRequest req = (HttpServletRequest) request;
      int id=0;
      try {id=Integer.valueOf(request.getParameter("uid"));
      }
      catch(NumberFormatException e)
      {//i=0;
      }

      request.setAttribute("users", userService.getmyjrshetuanuser(id));
      //SELECT  DISTINCT userid,stid,power,2power FROM usershetuan   ;
      request.getSession().setAttribute("shetuan", userService.get1st(id));
      request.getSession().setAttribute("shetuanid", userService.get1st(id).getId());
      request.getSession().setAttribute("shetuanname", userService.get1st(id).getName());
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
