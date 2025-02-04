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
String username="Aniket";
int password=1234;

String name=request.getParameter("user");
int pass=Integer.parseInt(request.getParameter("pass"));

if(username.equals(name)&& password==pass){
	out.println("Welcome To Your Account");
}
else{
	out.println("You Have Entered Wrong Username And Password !!!");
}
%>
</body>
</html>