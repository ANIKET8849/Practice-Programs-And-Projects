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
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Login1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		int account=Integer.parseInt(request.getParameter("input1"));
		int pin=Integer.parseInt(request.getParameter("input2"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
			Statement stat =conn.createStatement();
		ResultSet rs=stat.executeQuery("select account.card_no ,account.pin from account where card_no='"+account+"' and '"+pin+"'");
//			System.out.println(account);
//			System.out.println(pin)
			if(rs.next()) {
				response.sendRedirect("Main.jsp");
			}
			else {
				response.sendRedirect("Login.jsp");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
