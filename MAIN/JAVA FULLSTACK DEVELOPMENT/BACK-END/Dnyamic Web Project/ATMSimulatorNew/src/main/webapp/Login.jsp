<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN TO YOUR ACCOUNT</title>
<link rel="stylesheet" href="css/Style.css">
</head>
<body>
    <div class="container">
        <video src="images/pexels-rodnae-productions-5699998 (2160p).mp4" autoplay muted loop class="video">

        </video>
        <div class="row">
            <h2>Welcome To The ATM !!!</h2>
            <div class="login-box">
                <form action="Login1" method="post" class="Login1">
                <div class="user-box">
                    <label>Card No. :</label><input type="text" name="account"><br>
                </div>
                <div class="user-box">
                    <label>Pin :</label><input type="password" name="input2"><br>
                </div>
                <div class="buttons">
                    <a class="btn btn-info" id="btn1" href="Home.jsp">Back</a>
                 <button class="btn btn-success" id="button3" type="submit">Submit</button>
                 <button class="btn btn-secondary" id="button3" type="reset">Reset</button>
                </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>