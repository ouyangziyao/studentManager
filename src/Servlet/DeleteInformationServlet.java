package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.DeleteInformationService;

public class DeleteInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteInformationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("number"));
		DeleteInformationService diService = new DeleteInformationService();
		boolean flag = false;
		flag = diService.DeleteInformatinSer(num);
		request.setAttribute("flag", flag);
		request.getRequestDispatcher("view/deleteinformation.jsp");
	}

}
