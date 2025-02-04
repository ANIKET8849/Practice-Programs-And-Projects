package Employee;

import java.util.*;

//import Encapsulation.GettersSetters;

public class EmployeeName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Employee Name : ");
		String ename=sc.nextLine();
		
		GettersSetters gs =new GettersSetters();
		gs.setName(ename);
		String name3=gs.getName();
		System.out.println("Hello "+name3);
		
		
		
		
		
		

	}

}
