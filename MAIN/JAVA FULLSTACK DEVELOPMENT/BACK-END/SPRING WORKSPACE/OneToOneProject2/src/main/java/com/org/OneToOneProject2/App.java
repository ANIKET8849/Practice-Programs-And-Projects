package com.org.OneToOneProject2;

import java.util.Date;

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
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Voter v=new Voter();
    	v.setVid(1);
    	v.setVname("Aniket");
    	v.setVage(21);
    	
    	Vote vt1=new Vote();
    	vt1.setPname("AG");
    	vt1.setCdate(new Date());
    	vt1.setVoter(v);
    	
    	session.persist(v);
    	session.persist(vt1);
    	
    	transaction.commit();
    	
    	
    	
        System.out.println( "Congratulations, Run !!!");
        
        session.close();
        factory.close();
    }
}
