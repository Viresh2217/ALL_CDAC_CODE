package com.Spring.JDBC.DAO;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Spring.JDBC.entity.Student;

public  class StudentDaoImp implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	
	//INSERT DATA......................................................................

	public int insert(Student student) {
		 String query="insert into student(id,name,city)values(?,?,?)";
		 
	int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	        
		return r;
	}

	
	// UPDATE DATA.....................................................................
	public int update(Student student) {
		
		String query="update student set name=? , city=? where id=?";
		
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	
		return r;
	}
	
	
	
	// DELETE DATA.....................................................................
	
	public int delete(Student student) {
	
		String query="delete from student where id=?";
		int i = this.jdbcTemplate.update(query,student.getId());
		return i;
	}

// SELECT DATA OR GAT DATA FROM DATABASE....................................	

	public  Student getStudent(int studentId) {


		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImo();
		Student student=  this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}

	// GETTING LARGE DATA
	
	public List<Student> getAllStudent() {

         String query="select * from student";
         
         List<Student> student2 = this.jdbcTemplate.query(query,new RowMapperImo());
	
         
		
		return student2;
	}

	
	
	
	
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	



	
















	

}
