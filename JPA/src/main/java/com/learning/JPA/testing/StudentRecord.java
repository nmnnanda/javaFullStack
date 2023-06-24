package com.learning.JPA.testing;

 import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Address;
import com.learning.JPA.entity.Student;

public class StudentRecord {

	public static void main(String[] args) {
		Address addr = new Address();
		addr.setCity("Coimbatore");
		addr.setState("Tamil Nadu");
		addr.setCountry("India");
		
		
		Student s1 = new Student();
		s1.setStudentName("Akshay");
		s1.setAddress(addr);
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa_pu");
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(s1);
		transaction.commit();
		System.out.println("student record added");
		entityManager.close();
		factory.close();
		
		
		
		
		
		

	}

}
