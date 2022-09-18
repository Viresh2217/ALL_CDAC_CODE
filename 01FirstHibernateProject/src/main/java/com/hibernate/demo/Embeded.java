package com.hibernate.demo;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeded {

	public static void main(String[] args) {
	
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");	
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		
		
		
		
		Student st=new Student();
		st.setId(123);
		st.setName("Rupali");
		st.setCity("Nitrud");
		
		Certificate certificate=new Certificate();
		
		certificate.setCourse("JAVA");
		certificate.setCourseduration("2 MOnth");
		st.setCertificate(certificate);
		
		
		Student s=new Student();
		s.setId(127);
		s.setName("Viresh");
		s.setCity("Majalgaon");
		
		Certificate c = new Certificate();
		c.setCourse("Web JAVA");
		c.setCourseduration("5 MOnth");
		s.setCertificate(c);

		
		
		
		
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		// Object Save
		
		session.save(st);
		session.save(s);
		
		
		tx.commit();
		
		session.close();
		factory.close();
		

	}

}
