package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.imageio.spi.RegisterableService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.RegistrationDetail;
import com.service.RegistrationService;

/**
 * Servlet implementation class ShowUserServlet
 */
@WebServlet("/fetchUser.do")
public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegistrationService service = new RegistrationService();
		List<RegistrationDetail> list = service.getAll();
		request.setAttribute("RD", list);
	    RequestDispatcher rd= request.getRequestDispatcher("myTable.jsp");
		    rd.forward(request, response);
	}

}
