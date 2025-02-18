package com.org.MavenOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mains {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std=(Student) context.getBean("std1");
		std.Display();
		
		System.out.println("\n\n");
		Student std1=(Student) context.getBean("std2");
		std1.Display();
	}

}
