package com.org;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btn")!=null) {
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String pass=request.getParameter("password");
			long contact=Integer.parseInt(request.getParameter("contact"));
			String gender=request.getParameter("gender");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
				PreparedStatement ps=con.prepareStatement("select * from");
			}catch(Exception e) {
				e.getMessage();
			}
		}
	}

}
