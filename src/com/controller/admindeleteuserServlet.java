package com.controller;

import com.service.ServiceFactory;
import com.service.StudentService;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/admindeleteuserServlet")
public class admindeleteuserServlet extends HttpServlet {


  private static final long serialVersionUID = 1L;

  private static Logger logger = Logger.getLogger(admindeleteuserServlet.class.getName());
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
      int stid=0;
      try {
          stid=Integer.parseInt(request.getSession().getAttribute("shetuanid").toString());
      }
      catch(NumberFormatException e)
      {//i=0;
      }

      userService.deleteuserst( id,stid);
      //JOptionPane.showMessageDialog(null, "删除用户成功！请及时通知用户清退理由。");
      userService.addmessage( stid,id,"【清退通知】我们已经将您清退出社团："+String.valueOf(request.getSession().getAttribute("shetuanname"))+",如有疑问，请联系社团负责人，谢谢！");
    request.getRequestDispatcher("/WEB-INF/JSP/stdetail3.jsp").forward(request, response);
    return;

  }


}
