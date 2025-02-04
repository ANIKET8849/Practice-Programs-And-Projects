package com.org;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Percentage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		int one=Integer.parseInt(request.getParameter("sub1"));
		int two=Integer.parseInt(request.getParameter("sub2"));
		int three=Integer.parseInt(request.getParameter("sub3"));
		
		int sum=one+two+three;
		
		float per=(float) ((sum/300.0)*100);
		
		out.println("The Percentage Is "+per);
	}

}
