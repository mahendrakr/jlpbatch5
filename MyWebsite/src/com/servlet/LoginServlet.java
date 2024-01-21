package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.LoginDetail;
import com.factory.ObjectFactory;
import com.mapper.ObjectMapper;
import com.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ObjectMapper mapper = ObjectFactory.createObjectMapperInstance();
        LoginService service = ObjectFactory.createLoginServiceInstance();
        String message = service.validateUser(mapper.mapToLoginDetail(request)); 
         
    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/header.html");
		rd.include(request, response);
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/home.html");
		rd1.include(request, response);
		RequestDispatcher rd2 = request.getRequestDispatcher("/WEB-INF/footer.html");
		rd2.include(request, response);
        	 
	}

}
