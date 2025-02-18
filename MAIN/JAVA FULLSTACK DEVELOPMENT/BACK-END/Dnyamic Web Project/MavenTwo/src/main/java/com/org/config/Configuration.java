package com.org.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.org.beans.Employee;

@Configurable
public class Configuration {

	
	@Bean
	public Employee emp1() {
		Employee e=new Employee();
		e.setId(2);
		e.setName("Aniket");
		e.setClg("ECTI");
		return e;
	}
	
	@Bean
	public Employee emp2() {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Pratik");
		e.setClg("ECTI2");
		return e;
	}
}
