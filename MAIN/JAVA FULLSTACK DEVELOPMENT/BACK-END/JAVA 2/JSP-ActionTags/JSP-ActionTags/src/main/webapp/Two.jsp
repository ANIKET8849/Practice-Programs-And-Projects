<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	My first name is: <% out.println(request.getParameter("fname")); %>
	My last name is: <% out.println(request.getParameter("lname")); %>
</body>
</html>