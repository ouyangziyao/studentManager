package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UpdateInformationService;

public class UpdateInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateInformationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("number"));
		String name = request.getParameter("name");
		int cla = Integer.parseInt(request.getParameter("cla"));
		String sex = request.getParameter("sex");
		String birth = request.getParameter("birth");
		boolean flag = false;
		UpdateInformationService uiService = new UpdateInformationService();
		flag = uiService.UpdateInformationSer(num, name, cla, sex, birth);
		request.setAttribute("flag", flag);
		request.getRequestDispatcher("view/updateinformation.jsp");
	}

}
