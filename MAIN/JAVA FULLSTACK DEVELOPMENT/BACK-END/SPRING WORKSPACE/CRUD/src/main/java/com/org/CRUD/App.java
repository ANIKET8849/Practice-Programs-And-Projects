package com.org.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Date;


public class App 
{
    public static void main( String[] args )
    {

    	
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    
    	Session session=sf.openSession();
    
    	
    	CreateEmployee(session);
    }
    
    
    
    	public static Employee getEmployeeBy() {
    		Employee employee=new Employee();
    		employee.setEmployeeId(1);
    		employee.setEmployeeName("Aniket");
    		employee.setEmail("aniketgholap51@gmail.com");
    		employee.setSalary(90000);
    		employee.setDoj(new Date());
    		return employee;
    		
    	}
    	public static void CreateEmployee(Session session) {
    		Transaction t=session.beginTransaction();
    		session.persist(getEmployeeBy());
    		System.out.println("Employee Is Created  !!!");
    		t.commit();
    		session.close();
    	}
    	
    	
//    	public static void getAllEmployees(Session session) {
    		
//    		List<Employee> employee=(List<Employee>) session.createQuery("From Employee",Employee.class).list();
//    		if (!employees.isEmpty()) {
//    			System.out.println();
//    		}
    		
//    	}

	
}
