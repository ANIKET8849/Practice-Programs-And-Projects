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
	String name=request.getParameter("input1");
String mail=request.getParameter("input2");
String age=request.getParameter("input3");
String mobile=request.getParameter("input4");
String location=request.getParameter("input5");
String state=request.getParameter("input6");


out.println(" "+name+"<br>");
out.println(" "+mail+"<br>");
out.println(" "+age+"<br>");
out.println(" "+mobile+"<br>");
out.println(" "+location+"<br>");
out.println(" "+state+"<br>");
%>
</body>
</html>