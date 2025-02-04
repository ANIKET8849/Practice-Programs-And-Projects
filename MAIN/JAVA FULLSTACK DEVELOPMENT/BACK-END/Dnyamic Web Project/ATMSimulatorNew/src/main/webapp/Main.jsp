<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Style.css">
</head>
<body>
<div class="container">
        <div class="row">
            <div class="login-box">
                <h2>Welcome To Your Account !!!</h2>
                <form class="login">

                    <a class="right" href="Creadit1.jsp">CREDIT AMOUNT</a>
                    <a class="left" href="Pin.jsp">CHANGE PIN</a>
                    <a class="right" href="Withdraw.jsp">WITHDRAW AMOUNT</a>
                    <a class="left" href="Statement.jsp">STATEMENT</a>
                    <div class="center1">
                    	<a class="center" href="Login.jsp">EXIT</a>
                    </div>
                    
                </form>
                
            </div>
        </div>
    </div>
                <%
//HttpSession s = request.getSession();
//String account = (String)s.getAttribute("account");
//System.out.println(account);

//String card3=(String)s.getAttribute("account");
//s.setAttribute("account", card3);
//request.getRequestDispatcher("Statement.jsp").forward(request, response);
%>

</body>
</html>