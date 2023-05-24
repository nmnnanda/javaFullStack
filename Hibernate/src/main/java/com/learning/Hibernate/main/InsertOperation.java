package com.learning.Hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

public class InsertOperation {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Ankit","Java2EE");
		Student s2 = new Student(2,"Harsh","Hibernate");
		
		
		Configuration cfg = new Configuration()
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		session.beginTransaction();
		session.save(s1);
		System.out.println("S1 saved successfully....");
		session.save(s2);
		System.out.println("S2 saved successfully....");
		
		tx.commit();
		
		session.close();
		factory.close();

	}

}
