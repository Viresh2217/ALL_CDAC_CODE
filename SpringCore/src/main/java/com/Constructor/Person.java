package com.Constructor;



public class Person {
	
	private int personId;
	private String name;
	
	private Certificate certi;
	
	
	public Person(int personId, String name ,Certificate certificate) {
		
		this.personId = personId;
		this.name = name;
		this.certi=certificate;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", certi=" + certi + "]";
	}


	
	
	

}
