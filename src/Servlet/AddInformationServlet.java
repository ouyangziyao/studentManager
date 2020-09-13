package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.AddInformationService;

public class AddInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddInformationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num = 0;
		num = Integer.parseInt(request.getParameter("number"));
		String name = request.getParameter("name");
		int cla = Integer.parseInt(request.getParameter("cla"));
		String sex = request.getParameter("sex");
		String birth = request.getParameter("birth");
		boolean flag = false;
		AddInformationService aiService = new AddInformationService();
		flag = aiService.AddInformation(num, name, cla, sex, birth);
		request.getSession().setAttribute("flag", flag);
		response.sendRedirect("view/Judgment.jsp");
	}

}
