package com.Sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con=
				new ClassPathXmlApplicationContext("com/Sterio/SterioConfig.xml");
		Student son=(Student)con.getBean("student",Student.class);
		System.out.println(son);
		
		
		

	}

}
