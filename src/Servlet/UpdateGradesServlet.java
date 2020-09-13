package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UpdateGradesService;

public class UpdateGradesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateGradesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("number"));
		String name= request.getParameter("name");
		int cla = Integer.parseInt(request.getParameter("cla"));
		int math = Integer.parseInt(request.getParameter("math"));
		int java = Integer.parseInt(request.getParameter("java"));
		int english = Integer.parseInt(request.getParameter("english"));
		int sport = Integer.parseInt(request.getParameter("sport"));
		
		boolean flag = false;
		UpdateGradesService ugService = new UpdateGradesService();
		flag = ugService.UpdateGradesSer(num, name, cla, math, java, english, sport);
		request.setAttribute("flag", flag);
		request.getRequestDispatcher("view/updategrades.jsp");
	}

}
