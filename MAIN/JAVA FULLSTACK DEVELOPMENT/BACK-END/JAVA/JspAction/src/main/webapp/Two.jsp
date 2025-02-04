<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
My Name Is : <% out.println(request.getParameter("name"));  %> <br>
My Number Is : <% out.println(request.getParameter("number")); %>
</body>
</html>