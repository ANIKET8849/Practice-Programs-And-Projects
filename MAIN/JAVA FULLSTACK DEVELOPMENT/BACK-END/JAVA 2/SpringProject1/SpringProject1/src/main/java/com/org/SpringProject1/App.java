package com.org.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("First.xml");
    	One one=(One)context.getBean("abc");
    	
    	String fname=one.getFname();
    	String lname=one.getLname();
    	
    	System.out.println("Hello, "+fname+" "+lname);
    }
}
