package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.StudentEntity;
import Service.FormService;

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		FormService fService = new FormService();
		ArrayList<StudentEntity> list = null;
		
		int cla = Integer.parseInt(request.getParameter("cla"));
		list = fService.FormSer(cla);
		request.setAttribute("list", list);
		request.getRequestDispatcher("view/formview.jsp").forward(request, response);
	}

}
