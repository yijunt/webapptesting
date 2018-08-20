package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageOneProcess
 */
//@WebServlet("/pageOneProcess")
public class pageOneProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String id = request.getParameter("id");
//		String course = request.getParameter("course");
//		String faculty = request.getParameter("faculty");

		System.out.println("the name is " + name);
		System.out.println("the id is " + id);

		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("id", id);
		
		response.sendRedirect("html/pageTwo.html");
	}

}
