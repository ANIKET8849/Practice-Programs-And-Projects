package com.org.MavenTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.config.Configuration;
import com.org.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(Configuration.class);
        
        Employee emp1=(Employee) context.getBean("emp1");
        emp1.display();
        System.out.println("---------------------------------------");
        
        Employee emp2=(Employee) context.getBean("emp2");
        emp2.display();
    }
}
