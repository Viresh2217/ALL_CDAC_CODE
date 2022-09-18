package com.hibernate.demo;
import com.hibernate.demo.Address;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		
System.out.println( "Started..........." );
        
        Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");	
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		
//		Student student=(Student)session.get(Student.class,2);
//		// we can also use load here is same as get
////		Student student=(Student)session.load(Student.class,4);
//		System.out.println(student);
		
		
		Address address=(Address)session.get(Address.class,2);
		System.out.println(address.toString());
		
		
		
		session.close();
		factory.close();
		
		
		
		
		
		
		
		
		System.out.println("end...........Done");
        
        

	}

}
