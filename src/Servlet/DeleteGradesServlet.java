package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.DeleteGradesService;

public class DeleteGradesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteGradesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("number"));
		DeleteGradesService dgService = new DeleteGradesService();
		boolean flag = false;     
		flag = dgService.DeleteGrades(num);
		request.getSession().setAttribute("flag", flag);
		request.getRequestDispatcher("view/Failure.jsp");
	}

}
