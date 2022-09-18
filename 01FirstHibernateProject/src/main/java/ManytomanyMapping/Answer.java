package ManytomanyMapping;

public class Answer {

	private int ans_id;
	private String ans;
	
	
	private Question q;


	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Answer(int ans_id, String ans, Question q) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
		this.q = q;
	}


	public int getAns_id() {
		return ans_id;
	}


	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}


	public String getAns() {
		return ans;
	}


	public void setAns(String ans) {
		this.ans = ans;
	}


	public Question getQ() {
		return q;
	}


	public void setQ(Question q) {
		this.q = q;
	}


	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", ans=" + ans + ", q=" + q + "]";
	}
	
	
	
	
	
}
