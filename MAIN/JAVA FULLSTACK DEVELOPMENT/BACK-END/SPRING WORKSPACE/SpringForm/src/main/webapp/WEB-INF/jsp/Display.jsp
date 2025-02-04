<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String name=request.getParameter("first");
	String pass=request.getParameter("second");
	
	out.println("Hello ,"+name+"<br>");
	out.println("Your Pass Is ,"+pass);
%>
</body>
</html>