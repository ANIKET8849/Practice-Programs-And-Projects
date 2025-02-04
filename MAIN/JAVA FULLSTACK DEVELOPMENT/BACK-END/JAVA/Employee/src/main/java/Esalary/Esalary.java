package Esalary;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Esalary extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String ename=request.getParameter("name");
		int sal=Integer.parseInt(request.getParameter("salary"));
		
		out.println(" HII "+ename);
		
		if(sal<=10000) {
			double hra=(double)(20*sal/100);
			double da=(double)(80*sal/100);
			out.println("Your Salary Is "+sal);
			out.println("Your HRA Is "+hra);
			out.println("Your DA Is "+da);
		}
		else if(sal<=20000) {
			double hra2=(double)(25*sal/100);
			double da2=(double)(90*sal/100);
			out.println("Your Salary Is "+sal);
			out.println("Your HRA Is "+hra2);
			out.println("Your DA Is "+da2);
		}
		else {
			double hra3=(double)(30*sal/100);
			double da3=(double)(95*sal/100);
			out.println("Your Salary Is "+sal);
			out.println("Your HRA Is "+hra3);
			out.println("Your DA Is "+da3);
		}
	}

}
