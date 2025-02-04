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

public class Student extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String fname=request.getParameter("input1");
		String lname=request.getParameter("input2");
		int age=Integer.parseInt(request.getParameter("input3"));
		int marks=Integer.parseInt(request.getParameter("input4"));
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/studentdata","root","root");
			Statement stat=conn.createStatement();
			stat.executeUpdate("insert into student(s_fname,s_lname,s_age,s_marks) values ('"+fname+"','"+lname+"',"+age+","+marks+")");
			out.println("Data inserted Successfully!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
