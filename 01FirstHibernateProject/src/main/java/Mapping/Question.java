package Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int questionid;
	private String question;
	
	@OneToOne
	private Answer a;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionid, String question, Answer a) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.a = a;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getA() {
		return a;
	}

	public void setA(Answer a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + ", a=" + a + "]";
	}
	
	

}
	
	
	
	
	
	
	


