package com.hibernate.demo;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Student {
	
	
	@Id
	private int id;
	private String name;
	private String city;
	
	private Certificate certificate;
	
	
	public int getId() {
		return id;
	}



	public Certificate getCertificate() {
		return certificate;
	}



	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Student(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		
	}
	
	
	


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
