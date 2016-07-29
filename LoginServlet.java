package com.rass.shopingcart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		
		Dao Dao = new Dao();
		
		RequestDispatcher dispatcher;
		
		if( Dao.isValidUser(userID ,password) == true)
		{
			dispatcher = request.getRequestDispatcher("Home.html");
			dispatcher.forward(request,response);
			
		}
		else
		{
			
			
			System.out.println("Invalid credentials");
			
			PrintWriter writer = response.getWriter();
			
			writer.println("please enter valid credentials");
			
			dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.include(request,response);
			
		}
		}
	
}
