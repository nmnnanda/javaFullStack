package com.learning.JPA.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Employee;

public class InsertOperation {

	public static void main(String[] args) {
		Employee e3 = new Employee();
	
		e3.setName("Aman");
		e3.setDept("Testing");
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("employee_pu");
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(e3);
		
		entityTransaction.commit();
		System.out.println("Object saved successfully");
		
		entityManager.close();
	
		

	}

}
