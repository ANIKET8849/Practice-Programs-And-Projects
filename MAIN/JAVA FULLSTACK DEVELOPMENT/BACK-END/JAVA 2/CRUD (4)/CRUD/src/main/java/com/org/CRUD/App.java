package com.org.CRUD;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	
//    	CreateEmployee(session);
//    	getEmployeeById(session);
//    	updateEmployeeById(session);
//    	getEmployeeById(session);
    	deleteEmployeeById(session);
//    	getAllEmployees(session);

    }
    
    public static void getAllEmployees(Session session) {
    	List<Employee> employees = (List<Employee>) session.createQuery("From Employee", Employee.class).list();
    	if (!employees.isEmpty()) {
    		System.out.println("Employess Details:");
    		for(Employee employee : employees) {
    			System.out.println("ID: " + employee.getEmployeeId());
    			System.out.println("Name: " + employee.getEmployeeName());
    			System.out.println("Email: " + employee.getEmail());
    			System.out.println("Salary: " + employee.getSalary());
    			System.out.println("Date Of Joining: " + employee.getDoj());
    			System.out.println("-----------------------------");
    		}
    	}else {
    		System.out.println("NO Employees Found!!!!!");
    	}
    }
    
    @SuppressWarnings("deprecation")
    public static void deleteEmployeeById(Session session) {
        int employeeIdToDelete = 52;
        Employee employee = session.get(Employee.class, employeeIdToDelete);
        if (employee != null) {
            session.beginTransaction();
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Employee with ID " + employeeIdToDelete + " is deleted");
        }
        else {
			System.out.println("Employee with ID " + employeeIdToDelete + " is already deleted or does't exist");
		}
    }
    
    @SuppressWarnings("deprecation")
	private static void updateEmployeeById(Session session) {
    	Employee employee = session.get(Employee.class, 52);
    	if (employee != null) {
			employee.setSalary(80000.00);
			employee.setEmployeeName("Parth");
			employee.setEmail("parth123@gmail.com");
			session.beginTransaction();
			session.update(employee);
			session.getTransaction().commit();
			
		}
    	else {
			System.out.println("Employee is not exist with provided Id..");
		}
    }
    
	private static void getEmployeeById(Session session) {
    	Employee employee = session.get(Employee.class, 102);
    	if (employee != null) {
			System.out.println(employee);
		}
    	else {
			System.out.println("Employee is not exist with provided Id..");
		}	
    }
    
    
    public static Employee getEmployeeBy() {
    	Employee employee = new Employee();
        employee.setEmployeeName("Bunty");
        employee.setEmail("bunty@gmail.com");
        employee.setSalary(90000.00);
        employee.setDoj(new Date());
        return employee;
    }
    public static void CreateEmployee(Session session) {
    	Transaction T = session.beginTransaction();	
		@SuppressWarnings("deprecation")
		Integer id = (Integer) session.save(getEmployeeBy());
    	System.out.println("Employee is created with Id::" + id);
    	session.getTransaction();
    	T.commit();
    }
    
    	
}
