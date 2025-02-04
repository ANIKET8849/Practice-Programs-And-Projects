package com.org.OneToManyBank;

import java.util.Set;
import java.util.*;
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
        Transaction t=session.beginTransaction();
        
        Bank b1=new Bank();
        b1.setBid(1);
        b1.setBname("ICICI");
        
        Bank b2=new Bank();
        b2.setBid(2);
        b2.setBname("HDFC");
        
        Bank b3=new Bank();
        b3.setBid(3);
        b3.setBname("INDUSIND");
        
        Set<Bank> set=new HashSet<Bank>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        
        Person p=new Person();
        p.setPid(1);
        p.setPname("Aniket");
        p.setBank(set);
        
        session.persist(p);
        
        t.commit();
        System.out.println("Sucessfully Run");
        session.close();
        
        sf.close();
        
    }
}
