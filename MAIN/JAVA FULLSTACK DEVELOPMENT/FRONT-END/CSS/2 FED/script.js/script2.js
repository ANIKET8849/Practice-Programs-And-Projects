if(id=="Admin1" && pass == "1234"){
    out.println("You Have Sucessfully Login !!");
    response.sendRedirect("Admin.jsp");
}
else{
    out.println("You Have Entered Wrong Id And Password !!!");
   }