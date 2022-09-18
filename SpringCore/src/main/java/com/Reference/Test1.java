package com.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/Reference/NewConfig.xml");
	
	A temp =(A)context.getBean("Aref");
	
	System.out.println(temp.getX());
	System.out.println(temp.getObj().getY());
		
		
		
		

	}

}
