<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="#" method="get">
        <div>Name : <input type="text" name="name"></div>
        <div>Email : <input type="email" name="email"></div>
        <div>Password : <input type="password" name="password"></div>
        <div>Contact : <input type="tel" name="contact"></div>
        <div>Male<input type="radio" name="gender" value="male"> <br>
        Female<input type="radio" name="gender" value="Female"></div>
        <div>Profile Photo: <input type="url" name="img"> </div><br>
        <div><button type="submit" name="btn">Submit</button></div>
    </form>
    
    
    <%
    	
    	if(request.getParameter("btn")!=null){
    		try{
    			String name=request.getParameter("name");
    			String email=request.getParameter("email");
    			String pass=request.getParameter("password");
    			long contact=Integer.parseInt(request.getParameter("contact"));
    			String gender=request.getParameter("gender");
    			String img=request.getParameter("img");
    			
    			HttpSession ses =request.getSession();
    			ses.setAttribute("Name",name);
    			ses.setAttribute("Email", email);
    			ses.setAttribute("Password",pass);
    			ses.setAttribute("Cotact",contact);
    			ses.setAttribute("Gender",gender);
    			ses.setAttribute("Image",img);
    			response.sendRedirect("NextPage.jsp");
    		}catch(Exception e){
    			e.getMessage();
    			e.printStackTrace();
    		}
    	}
    
    
    %>
</body>
</html>