package com.org.SetterBased;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("school.xml");
        Teacher T=(Teacher)context.getBean("teacher");
        System.out.println(T.getStudent().getMessage());
    }
}
