package com.org.HibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction tr=session.beginTransaction();
        
        Student st=new Student();
        st.setId(1);
        st.setName("Aniket");
        st.setMarks(80);
        
        session.merge(st);
        
        tr.commit();
        
        System.out.println("Record Inserted Sucessfully !!!");
        session.close();
    }
}
