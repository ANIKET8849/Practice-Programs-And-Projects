<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN SECTION</title>
</head>
<body>
 <div class="container">
        <div class="row">
            <div class="login-form">
            <h2>Welcome To The Admin Section</h2>
                <form method="post" action="AdminData" class="login">
<!--                     <label for="">Card No. :</label><input type="number" name="input1" placeholder="Enter Your Card Number"><br>
                    <label for="">Pin :</label><input type="password" name="input2" placeholder="Enter Your Pin"><br> -->
                    
                    
                    <label for="input1">Name :</label><input type="text" name="input1" placeholder="Enter Your Name"><br>
                    <label for="input2">Age :</label><input type="number" name="input2" placeholder="Enter Your Age"><br>
                    <label for="input3">Mobile No :</label><input type="number" name="input3" placeholder="Enter Your Phone Number"><br>
                    <label for="input4">Aadhar No :</label><input type="text" name="input4" placeholder="Enter Your Aadhar Card Number"><br>
                    <label for="input5">Pan No :</label><input type="text" name="input5" placeholder="Enter Your Pan Number"><br> 
                    <label for="input6">Account Type :</label>
					<select name="input6">
					<option value="Savings">Savings </option>
					<option value="Current">Current </option>
					<option value="Buisness">Buisness </option>
					</select><br>
					<label for="input7">Add Amount :</label><input type="number" name="input7" placeholder="Enter Your Want To add"><br> 
					<label for="input8">Address :</label><input type="text" name="input8" placeholder="Enter Your Address"><br> 
					<a href="Home.jsp">Back</a>
                    <button type="submit">Submit</button>
                    <button type="reset">Reset</button>
                </form>
            </div>
        </div>
    </div>

</body>
</html>