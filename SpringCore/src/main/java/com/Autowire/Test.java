package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Constructor.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Autowire/WireConfig.xml");
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);
		
	}
	

}
