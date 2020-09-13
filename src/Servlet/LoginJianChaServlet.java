package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.StudentEntity;
import Service.LoginService;
public class LoginJianChaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginJianChaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname=request.getParameter("uname");
	     String pwd=request.getParameter("pwd");
	     int status = Integer.parseInt(request.getParameter("status")); 
	     StudentEntity student = new StudentEntity();
	     student.setName(uname);
	     ArrayList<StudentEntity> list = new ArrayList<>();
	     list.add(student);
	     
	      if(uname.equals("")||pwd.equals("")){
	    	  response.sendRedirect("view/login.jsp");
	      }else{
	    	  LoginService ls = new LoginService();
	    	  boolean yes = ls.isExist(uname, pwd,status);
	    	  HttpSession session = request.getSession();
	    	  if(yes && status == 2){
	    		  session.setAttribute("list", list);
	    		  response.sendRedirect("view/admin_tea_main.jsp");
	    	  }else if(yes && status == 1) {
	    		  session.setAttribute("list", list);
	    		  response.sendRedirect("view/stumain.jsp");
	    	  }else{
	    		  response.sendRedirect("view/login.jsp");
	    	  }
	      }
	}

}
