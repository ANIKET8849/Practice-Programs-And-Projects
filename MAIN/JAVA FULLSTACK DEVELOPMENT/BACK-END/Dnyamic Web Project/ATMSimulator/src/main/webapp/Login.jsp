<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER LOGIN</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
 <div class="container">
        <div class="row">
            <h2>Welcome To The ATM</h2>
            <div class="login-box">
                <form action="Login1" method="post" class="login">
                <div class="user-box">
                    <label>Card No. :</label><input type="number" name="input1"><br>
                </div>
                <div class="user-box">
                    <label>Pin :</label><input type="password" name="input2" ><br>
                </div>
                   	<a class="btn btn-info" href="Home.jsp">Back</a>
                    <button class="btn btn-success" type="submit">Submit</button>
                    <button class="btn btn-secondary"type="reset">Reset</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>