package com.learning.JPA.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Owner owner1 = new Owner();
		owner1.setOwner_name("Sachin");
		
		Vehicle v1 = new Vehicle();
		v1.setVehicle_name("Audi");
		v1.setVehicle_type("Petrol-Engine");
		v1.setOwner(owner1);
		
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa_pu");
		EntityManager entityManager =factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(v1);
		
		transaction.commit();
		System.out.println("Vehicle object addedd successfully");
		
		entityManager.close();
		factory.close();
		
		
	}

}
