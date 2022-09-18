package com.hibernate.demo;

import com.hibernate.demo.Address;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Started..........." );
        
        Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");	
		
		SessionFactory factory = configuration.buildSessionFactory();
		System.out.println(factory);
		
		
		
		Student st=new Student(5, "Rakhi"," OLD Majalgaon");
		System.out.println(st);
		
		/*
		//Creating Object Of Address Class
		
		Address ad=new Address();
		
		ad.setAddressId(106);
		ad.setStreet("street1");
		ad.setAddDate(new Date());
		
		ad.setOpen(true);
		
		ad.setImage(null);
		
		ad.setCity("Pune");
		
	
		ad.setX(120.3221);
		
		//Reading Image
		
		FileInputStream fis=new FileInputStream("src/main/java/photo1.jpg");
		
		byte[] data= new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		*/
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(st);
//		session.save(ad);
		
	      transaction.commit();
		
	      session.close();
		
		
		System.out.println("end...........Done");
        
        
    }
}
