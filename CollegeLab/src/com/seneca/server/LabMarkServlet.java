package com.seneca.server;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LabMarkServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		//Student st = new Student();
		ArrayList<Student> list = new ArrayList();
		
		for(int i = 0; i<4; i++){
			Student st = new Student();
			st.setName("sale" + i);
			st.setMark("ocena " +i);
			list.add(st);
			
		}
		
		
		
		 /*
			String name = request.getParameter("name");   
			String number = request.getParameter("number");  		
			String mark = request.getParameter("mark");  */
			
			
			
			
			
	

	    request.setAttribute( "student_info" , list );
	    
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher( "/output.jsp" );
		dispatcher.forward(request,response );
	}

}
