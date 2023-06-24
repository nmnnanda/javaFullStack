package com.learning.JPA.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Employee;
 
public class ReadOperation {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("employee_pu");
		
		EntityManager entityManager = factory.createEntityManager();
		Employee emp = entityManager.find(Employee.class, 1);
		System.out.println(emp);
		entityManager.close();

	}

}
