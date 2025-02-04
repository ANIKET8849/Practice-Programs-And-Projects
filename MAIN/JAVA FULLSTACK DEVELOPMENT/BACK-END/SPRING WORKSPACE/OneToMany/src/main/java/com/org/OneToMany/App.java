package com.org.OneToMany;

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
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        
        Movies m1 = new Movies();
        m1.setMid(1);
        m1.setMoviesname("Enola Homes");
        
        Movies m2=new Movies();
        m2.setMid(2);
        m2.setMoviesname("Godzilla");
        
        Movies m3 = new Movies();
        m3.setMid(3);
        m3.setMoviesname("Stranger Things");
        
        Set<Movies> set=new HashSet<Movies>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        
        Actor a= new Actor();
        a.setAid(1);
        a.setActorname("Millie Bobby Brown");
        a.setMovies(set);
        
        session.persist(a);
        
        t.commit();
        System.out.println("Sucessfully Run !!!");
        session.close();
        sf.close();
    }
}
