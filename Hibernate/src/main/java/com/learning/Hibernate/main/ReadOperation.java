package com.learning.Hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

public class ReadOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration()
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		session.close();
		factory.close();

	}

}
