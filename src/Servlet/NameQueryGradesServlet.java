package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.StudentEntity;
import Service.NameQueryGradesService;

public class NameQueryGradesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NameQueryGradesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		NameQueryGradesService nqgService = new NameQueryGradesService();
		ArrayList<StudentEntity> list = nqgService.NameQueryService(name);
		request.setAttribute("list",list);
		request.getRequestDispatcher("view/querygradesview.jsp").forward(request, response);
	}

}
