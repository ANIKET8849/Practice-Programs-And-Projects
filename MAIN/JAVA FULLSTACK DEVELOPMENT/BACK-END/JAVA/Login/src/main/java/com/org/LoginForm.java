package com.org;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginForm extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String name1="Aniket Gholap";
		String pass1="1234";
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(name.equals(name1) && pass.equals(pass1)) {
			out.println("You Are Sucessfully Log In");
			
		}
		else {
			out.println("You Have Entered Wrong Username And Pass");
		}
		
	}

}
