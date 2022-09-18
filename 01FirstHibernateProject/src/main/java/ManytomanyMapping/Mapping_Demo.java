package ManytomanyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Mapping.Answer;
import Mapping.Question;

public class Mapping_Demo {

	public static void main(String[] args) {
		
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");	
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		
		Question q=new Question();
		q.setQuestionid(1);
		q.setQuestion("what is java");
		
		
		
		Answer a=new Answer();
		a.setAnswer("java is language");
		a.setAnswerid(1);
		
		q.setA(a);
		
		
		Answer a1=new Answer();
		a1.setAnswer("which is used to develope software");
		a1.setAnswerid(2);
		
		q.setA(a1);
		
		
		Answer a2=new Answer();
		a2.setAnswer("it is hard language than other");
		a2.setAnswerid(3);
		
		q.setA(a2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		
		session.save(q);
		session.save(a);
		
		
		tx.commit();
		
		
		Question q1= (Question)session.get(Question.class, 1);	
		Answer d1= (Answer)session.get(Answer.class, 1);
		System.out.println(q1);
		System.out.println(d1);
		
		
		session.close();
		factory.close();
		
		

		
		
		
		

	}

}
