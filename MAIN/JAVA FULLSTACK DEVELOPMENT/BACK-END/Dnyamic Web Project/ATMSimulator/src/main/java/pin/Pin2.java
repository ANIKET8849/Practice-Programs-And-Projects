package pin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Pin2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
		
		    String currentPinCode = "1234";

		    String enteredPinCode = request.getParameter("input1");
		    String newPinCode = request.getParameter("input2");


		    if (enteredPinCode.equals(currentPinCode)) {

		        if (newPinCode.length() == 4) {
	
		            currentPinCode = newPinCode;

		            out.println("<h3>Pin code changed successfully!</h3>");
		        } else {
		            out.println("<h3>Invalid pin code length. Pin code must be 4 digits.</h3>");
		        }
		    } else {
		        out.println("<h3>Incorrect pin code. Please try again.</h3>");
		    }

	}

}
