package com.hibernate.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String course;
	private String courseduration;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String course, String courseduration) {
		super();
		this.course = course;
		this.courseduration = courseduration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseduration() {
		return courseduration;
	}

	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}

	@Override
	public String toString() {
		return "Certificate [course=" + course + ", courseduration=" + courseduration + "]";
	}
	
	
	
	
	

	

}
