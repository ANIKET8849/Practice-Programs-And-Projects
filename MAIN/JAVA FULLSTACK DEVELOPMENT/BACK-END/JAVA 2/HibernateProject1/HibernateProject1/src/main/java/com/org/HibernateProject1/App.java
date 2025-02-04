package com.org.HibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction tr=session.beginTransaction();
        
        Student st=new Student();
        st.setId(1);
        st.setName("Ketaki");
        st.setMarks(75);
        
        session.merge(st);  //Update the table
        
        tr.commit(); //Ends the transaction
        System.out.println("Record inserted Successfully!!");
        session.close();
    }
}
