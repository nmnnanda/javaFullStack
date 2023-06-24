 package com.learning.JPA.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Employee;

public class DeleteOperation {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("employee_pu");
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Employee emp = entityManager.find(Employee.class,2);
		entityManager.remove(emp);
		transaction.commit();
		System.out.println("OPbject removed successfully");

	}

}
