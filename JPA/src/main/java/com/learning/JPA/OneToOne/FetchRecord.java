 package com.learning.JPA.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchRecord {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa_pu");
      EntityManager entityManager = factory.createEntityManager();
      Vehicle v1 = entityManager.find(Vehicle.class, 1);
      if(v1==null){
    	  System.out.println("Object not found");
      }else{
      System.out.println("Owner of Toyota :"+v1.getOwner().getOwner_name());
      
      }
      entityManager.close();
      factory.close();
      
	}

}
