package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.StudentEntity;
import Service.NumQueryGradesService;


public class NumQueryGradesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NumQueryGradesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("number"));
		NumQueryGradesService nqgService = new NumQueryGradesService();
		ArrayList<StudentEntity> list = null;
		list = nqgService.NumQueryService(num);
		request.getSession().setAttribute("list",list);
		response.sendRedirect("view/querygradesview.jsp");
	}

}
