<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Data Fetching</title>

</head>
<body>
<h2>Student Data</h2>
<form>
<table class='container table table-bordered'>
<% 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select *from student");
	
	out.println("<thead class='table table-dark'> <th>ID</th> <th>NAMES</th> <th>AGE</th> </thead>");
	
	while(rs.next()){
		int s_id=rs.getInt(1);
		String s_name=rs.getString(2);
		int s_age=rs.getInt(3);
		
		out.println("<tr class='table table-info'> <td>"+s_id+"</td> <td>"+s_name+"</td> <td>"+s_age+"</td> </tr>");
	}
%>
</table>
</form>
</body>
</html>