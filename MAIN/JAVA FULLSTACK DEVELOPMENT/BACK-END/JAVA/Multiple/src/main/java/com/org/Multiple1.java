package com.org;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Multiple1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int num=Integer.parseInt(request.getParameter("input1"));
		int num2=Integer.parseInt(request.getParameter("input2"));
		
		int k= num2%num;
		if(k==0) {
			out.printf("%d Is Multiple Of %d",num,num2);
		}
		else {
			out.printf("%d Is Not Multiple Of %d",num,num2);
		}
		
	}

}
