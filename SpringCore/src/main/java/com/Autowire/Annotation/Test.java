package com.Autowire.Annotation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Constructor.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Autowire/Annotation/WireConfig.xml");
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);
		
	}
	

}
