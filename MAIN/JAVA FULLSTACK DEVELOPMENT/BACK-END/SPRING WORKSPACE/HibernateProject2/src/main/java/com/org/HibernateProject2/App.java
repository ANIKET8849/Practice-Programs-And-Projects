package com.org.HibernateProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	
    	Transaction tr=session.beginTransaction();
    	
    	Employee e=new Employee();
    	e.setId(1);
    	e.setEname("Aniket");
    	e.setAge(21);
    	e.setSalary("10000");
        
    	session.merge(e);
    	
    	tr.commit();
    	
    	System.out.println("Record Inserted Sucessfully !!!");
    	
    	session.close();
    }
}
