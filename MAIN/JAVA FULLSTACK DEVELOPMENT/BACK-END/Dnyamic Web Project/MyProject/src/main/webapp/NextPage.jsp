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
	String name=(String) session.getAttribute("Name");
	String email=(String) session.getAttribute("Email");
	String pass=(String) session.getAttribute("Password");
	long cont=(long) session.getAttribute("Cotact");
	String Gender=(String) session.getAttribute("Gender");
	String Image=(String) session.getAttribute("Image");
	
	
%>

<div class="container d-flex justify-content-center mt-5">

	<div class="card">
		
		<div class="top-container">
			
			<img src=<%=Image %> class="img-fluid profile-image" width="70">
			
			<div class="ml-3">
				<h5 class="name"><%=name %></h5>
				<p class="mail"><%=email%></p>
				<p class="mail"><%=pass%></p>
			</div>
		</div>


		<div class="middle-container d-flex justify-content-between align-items-center mt-3 p-2">
				<div class="dollar-div px-3">
					
					<div class="round-div"><i class="fa fa-dollar dollar"></i></div>

				</div>
				<div class="d-flex flex-column text-right mr-2">
					<span class="current-balance"><%=Gender%></span>
					<span class="amount"><span class="dollar-sign"></span><%=cont %></span>
				</div>

		</div>

		<div class="recent-border mt-4">
			<span class="recent-orders">Recent orders</span>
		</div>
		<div class="wishlist-border pt-2">
			<span class="wishlist">Wishlist</span>
		</div>
		<div class="fashion-studio-border pt-2">
			<span class="fashion-studio">Fashion studio</span>
		</div>
		
	</div>
	
</div>

<style>
body{
	background-color: #eee;
}
.card{
	background-color: #fff;
	width: 280px;
	border-radius: 33px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
	padding: 2rem !important;
}
.top-container{
	display: flex;
	align-items: center;
}
.profile-image{
	border-radius: 10px;
	border: 2px solid #5957f9;
}
.name{
	font-size: 15px;
	font-weight: bold;
	color: #272727;
	position: relative;
	top: 8px;
}
.mail{
	font-size: 14px;
	color: grey;
	position: relative;
	top: 2px;
}
.middle-container{
	background-color: #eee;
	border-radius: 12px;

}
.middle-container:hover {
	border: 1px solid #5957f9;
}
.dollar-div{
	background-color: #5957f9;
	padding: 12px;
	border-radius: 10px;
}
.round-div{
	border-radius: 50%;
	width: 35px;
	height: 35px;
	background-color: #fff;
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
}
.dollar{
	font-size: 16px !important;
	color: #5957f9 !important;
	font-weight: bold !important;
}


.current-balance{
	font-size: 15px;
	color: #272727;
	font-weight: bold;
}
.amount{
	color: #5957f9;
	font-size: 16px;
	font-weight: bold;
}
.dollar-sign{
	font-size: 16px;
	color: #272727;
	font-weight: bold;
}

.recent-border{
	border-left: 2px solid #5957f9;
	display: flex;
	align-items: center;

}
.recent-border:hover {
	border-bottom: 1px solid #dee2e6!important;
}

.recent-orders{
	font-size: 16px;
	font-weight: 700;
	color: #5957f9;
	margin-left: 2px;
}

.wishlist{
	font-size: 16px;
	font-weight: 700;
	color: #272727;

}
.wishlist-border:hover{
	border-bottom: 1px solid #dee2e6!important;
}
.fashion-studio{
	font-size: 16px;
	font-weight: 700;
	color: #272727;
}
.fashion-studio-border:hover {
	border-bottom: 1px solid #dee2e6!important;
}

</style>
</body>
</html>