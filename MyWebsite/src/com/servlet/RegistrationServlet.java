package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.RegistrationDetail;
import com.mapper.RegistrationMapper;
import com.service.JdbcService;
import com.service.RegistrationService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register.do")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RegistrationMapper regMapper = new RegistrationMapper();
		RegistrationDetail regDetail = regMapper.map(request);
		RegistrationService service = new RegistrationService();
		int count = service.save(regDetail);
		
	    RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/success.html");
	    rd.forward(request, response);
		//if you want to write something on browser
		//PrintWriter out = response.getWriter();
		//out.write(count+" "+"record has been saved"); 
	}

}
