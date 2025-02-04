package com.org;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Data extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("input1");
		String lname=request.getParameter("input2");
		int age=Integer.parseInt(request.getParameter("input3"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement stat =conn.createStatement();
			stat.executeUpdate("insert into data(s_fname,s_lname,s_age) values ('"+fname+"','"+lname+"',"+age+")");
			out.println("Data Entered Successfully !!! ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
