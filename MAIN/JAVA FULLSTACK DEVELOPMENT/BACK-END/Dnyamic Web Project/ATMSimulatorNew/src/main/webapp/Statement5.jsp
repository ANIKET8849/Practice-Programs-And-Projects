<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display User Data</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link rel="stylesheet" href="css/Style.css">
</head>
<body>
    <div class="container w-100">
        <table class="table table-success w-80" border="2" colspan="2" rowspan="2">
            <thead>
                <tr>
                    <th>CARD NUMBER</th>
                    <th>CREDIT AMOUNT</th>
                    <th>WITHDRAW AMOUNT</th>
                    <th>AMOUNT</th>
                </tr>
            </thead>
            <tbody class="table table-primary">
       <% 
       HttpSession s = request.getSession();
       String card = (String)s.getAttribute("card");
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM statement WHERE card_no='" + card + "'");
			while (rs.next()){
           
               String CARD = rs.getString("card_no");
               int CREDIT = rs.getInt("creadit_amount");
               int WITHDRAW = rs.getInt("withdraw_amount");
               int AMOUNT = rs.getInt("amount");
               out.println("<tr><td>"+CARD+"</td><td>"+CREDIT+"</td><td>"+ WITHDRAW +"</td><td>"+AMOUNT+"</td></tr>");
          
			}
           
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       %>
            </tbody>
        </table>
        <a class="btn btn-info display-flex justify-content-center w-10" id="btn1" href="index.jsp">Back</a>
    </div>
</body>
</html>

