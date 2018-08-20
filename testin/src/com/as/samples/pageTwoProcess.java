package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageTwoProcess
 */
//@WebServlet("/pageTwoProcess")
public class pageTwoProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String course = request.getParameter("course");
		String faculty = request.getParameter("faculty");

		System.out.println("the name is " + course);
		System.out.println("the id is " + faculty );

		request.getSession().setAttribute("faculty", faculty);
		request.getSession().setAttribute("course", course);
		
		response.sendRedirect("jsp/printout.jsp");

	}

}
