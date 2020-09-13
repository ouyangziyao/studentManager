package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.StudentEntity;
import Service.NumQueryInformationService;

public class NumQueryInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NumQueryInformationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("number"));
		NumQueryInformationService nqiService = new NumQueryInformationService();
		ArrayList<StudentEntity> list = nqiService.NumQueryInformationSer(num);
		request.setAttribute("list", list);
		request.getRequestDispatcher("view/queryinformationview.jsp").forward(request, response);;
	}

}
