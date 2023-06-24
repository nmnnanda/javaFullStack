 package com.learning.JPA.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Employee;

public class ReadAllOperation {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("employee_pu");
		
		EntityManager entityManager = factory.createEntityManager();
		for(int i=1;i<=2;i++){
			Employee emp = entityManager.find(Employee.class, i);
			System.out.println(emp);
		}
	}

}
