package ManytomanyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Question {
	
	@Id
	private int que_id;
	private String que;
	
	
	
	


	


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Question(int que_id, String que, Answer answer) {
		super();
		this.que_id = que_id;
		this.que = que;
		
	}


	public int getQue_id() {
		return que_id;
	}


	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}


	public String getQue() {
		return que;
	}


	public void setQue(String que) {
		this.que = que;
	}





	
	
	
	
	
	
	
	
	
	
	
	
	

}
