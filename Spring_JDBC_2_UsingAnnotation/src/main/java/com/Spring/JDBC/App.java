package com.Spring.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.JDBC.DAO.StudentDao;
import com.Spring.JDBC.DAO.StudentDaoImp;
import com.Spring.JDBC.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " Start......." );
        
        // jdbc spring templete
        
        ApplicationContext context= new AnnotationConfigApplicationContext(JDBCConfig.class);
        
        JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class);
        
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
       
		
		/*
		 * Student student=new Student(); student.setCity("Beed"); student.setId(7);
		 * student.setName("Rupali");
		 * 
		 * int result= studentDao.insert(student);
		 * System.out.println("Sucessfully inserted........."+result);
		 * 
		 */
       
       
       
       
		/*
		 * 
		 * Student student=new Student(); student.setId(3); student.setCity("Pune");
		 * student.setName("Sushil Kapse");
	
		 * int i = studentDao.update(student);
		 * System.out.println("Sucessfully Updated ..........."+i);
		 */
       
       
       
		/*
		 * 
		 * Student student =new Student(); student.setId(4); int delete =
		 * studentDao.delete(student);
		 * 
		 * System.out.println("Sucessfully Delete............"+delete+" Value");
		
		 */
       
       
       
       
		/*
		 * Student student= studentDao.getStudent(3); System.out.println(student);
		 */
       
       
       
       List<Student> allStudent = studentDao.getAllStudent();
       
       for(Student s: allStudent) {
    	   System.out.println(s);
    	   
    	   
       }
       
       
       
       
       
       
       
       
        
    }
}
