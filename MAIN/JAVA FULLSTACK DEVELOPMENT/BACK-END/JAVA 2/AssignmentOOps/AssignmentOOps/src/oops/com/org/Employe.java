package oops.com.org;

/*Write a program in Java to take data of an employee as an input and
print the data using Getters and Setters.*/

import java.util.Scanner;

class Employee {

	
	private String Id;
	private String FName;
	private String LName;
	private long Number;
	private String Email;
	private int age;
	private long salary;
	
	
	public String getId()
	{
		return Id;
	}
	public void setId(String Id2)
	{
		this.Id=Id2;
	}
	
	public String getFName()
	{
		return FName;
	}
	public void setFName(String Fname2)
	{
		this.FName=Fname2;
	}

	
	public String getLName()
	{
		return LName;
	}
	public void setLName(String Lname2)
	{
      this.LName=Lname2;		
	}

	
	public long getNumber()
	{
		return Number;
	}
	public void setNumber(long Number2)
	{
		this.Number=Number2;
	}

	
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String gmail2)
	{
     this.Email=gmail2;		
	}

	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age2)
	{
	this.age=age2;	
	}
	

	public long getsalary()
	{
		return salary;
	}
	public void setsalary(long salary2)
	{
		this.salary=salary2;
	}
}
public class Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Id: ");
		String Id1= sc.nextLine();
		
		System.out.println("Enter Your First Name: ");
		String Fname1= sc.nextLine();
		
		System.out.println("Enter Your Last Name: ");
		String Lname1= sc.nextLine();
		
		System.out.println("Enter Your Number: ");
		long Number1= sc.nextLong();
		
		System.out.println("Enter Your Gmail Id: ");
		String gmail1= sc.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age1= sc.nextInt();
		
		System.out.println("Enter Your Salary: ");
		long salary1= sc.nextLong();
		
		Employee ep=new Employee();
		
		ep.setId(Id1);
		String Id3=ep.getId();
		System.out.println("ID Number: "+Id3);
		
		ep.setFName(Fname1);
		String Fname3=ep.getFName();
		System.out.println("First Name: "+Fname3);
		
		ep.setLName(Lname1);
		String Lname3=ep.getLName();
		System.out.println("Last Name: "+Lname3);
		
		ep.setNumber(Number1);
		long Number3=ep.getNumber();
		System.out.println("Phone Number "+Number3);
		
		ep.setEmail(gmail1);
		String gmail3=ep.getEmail();
		System.out.println("Gmail Id: "+gmail3);
		
		ep.setAge(age1);
		int age3=ep.getAge();
		System.out.println("Age: "+age3);
		
		
		ep.setsalary(salary1);
		long salary3=ep.getsalary();
		System.out.println("Salary: "+salary3);
	}

}
