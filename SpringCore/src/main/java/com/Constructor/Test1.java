package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/Constructor/ConConfig.xml");

		Person P = (Person) context.getBean("person");
		System.out.println(P);
		
		

	}

}
