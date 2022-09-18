package com.Spring.JDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Spring.JDBC.DAO.StudentDao;
import com.Spring.JDBC.DAO.StudentDaoImp;

@Configuration
public class JDBCConfig {
	
	
	@Bean(name={"ds"})
	public DataSource getDataSource()
	{
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("password");
		
		return ds;
		
		
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate geTemplate() {
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
	
	
	@Bean(name={"studentDao"})
	public StudentDao getStudentDao() {
		
		StudentDaoImp studentDaoimo =new StudentDaoImp();
		studentDaoimo.setJdbcTemplate(geTemplate());
		
		return studentDaoimo;
		
	}
	
	

}
