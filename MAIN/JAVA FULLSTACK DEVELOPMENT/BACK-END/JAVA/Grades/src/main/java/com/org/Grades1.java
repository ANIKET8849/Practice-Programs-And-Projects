package com.org;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Grades1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		int one=Integer.parseInt(request.getParameter("sub1"));
		int two=Integer.parseInt(request.getParameter("sub2"));
		int three=Integer.parseInt(request.getParameter("sub3"));
		
		int sum=one+two+three;
		
		float per=(float) ((sum/300.0)*100);
		
		out.println("The Percentage Is "+per);
		
		if(per>=90) {
			out.println("Congratulations You Are Pass With Grade A");
		}
		else if(per>=75) {
			out.println("Congratulations You Are Pass With Grade B");
		}
		else if(per>=50) {
			out.println("Congratulations You Are Pass With Grade C");
		}
		else if(per>=35) {
			out.println("Congratulations You Are Pass With Grade D");
		}
		else {
			out.println("Sorry !  You Are Failed");
		}
	}

}
