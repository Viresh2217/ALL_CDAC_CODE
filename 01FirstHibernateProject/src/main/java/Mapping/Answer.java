package Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	private int Answerid;
	private String answer;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Answer [Answerid=" + Answerid + ", answer=" + answer + "]";
	}


	public int getAnswerid() {
		return Answerid;
	}


	public void setAnswerid(int answerid) {
		Answerid = answerid;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Answer(int answerid, String answer) {
		super();
		Answerid = answerid;
		this.answer = answer;
	}
	
	
	
	
	
	

	

}
