package oops.com.org;

import java.util.Scanner;

/*Write a program by creating an ‘Employee’ class having the following
methods and print the salary.
a. ‘getInfo()’ which takes the salary, number of hours of work per
day as parameters.
b. ‘addsal()’ which adds 50% of the salary to the salary of the
employee if it is less than 10,000.
c. ‘addwork()’ which adds 20% of the salary to the salary if number
of work hours per day is more than 8 hours.*/
class Employees{
	double  Salary;
	double  hours;
	public Employees(double Salary,double hours)
	{
		this.Salary=Salary;
		this.hours=hours;
	}
	public void getInfo(double Salary,double hours)
	{
		this.Salary=Salary;
		this.hours=hours;
	}
	public void addsal(double Salary)
	{
		this.Salary=Salary;
		this.hours=hours;
		if(Salary<10000)
		{
		double	Salary1= (50*Salary)/100;
		System.out.println("Salary: "+Salary1);
		}
	}
		public void addwork(double Salary,double hours) {
			this.Salary=Salary;
			this.hours=hours;
			if(hours>8)
			{
				double Salary1= (20*Salary)/100;
				System.out.println("Salary: "+Salary1);
				 
		}
		}
			public double getsalry()
             {
				return Salary;
				}
			
		}


public class EmployeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the Salary");
 double  salary=sc.nextLong();
 
 System.out.println("Enter the hours");
 double  hour=sc.nextFloat();
 
 Employees ep=new Employees(salary,hour);
 
     ep.addsal(salary);
  ep.addwork(salary, hour);
  
  System.out.println("The salary is: "+(ep.getsalry()));
	}

}
