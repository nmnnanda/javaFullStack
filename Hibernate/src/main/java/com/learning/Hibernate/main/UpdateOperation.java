package com.learning.Hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

public class UpdateOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration()
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
         session.beginTransaction();
         Student student = session.get(Student.class, 2);
         if(student==null){
        	 System.out.println("Object not found");
         }else{
        	 student.setCourse_enrolled("Web dev");
        	 session.update(student);
        	 tx.commit(); 
        	 System.out.println("Object updated successfully");
         }
	}

}
