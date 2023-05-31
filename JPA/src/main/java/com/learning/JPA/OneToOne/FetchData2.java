package com.learning.JPA.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa_pu");
      EntityManager entityManager = factory.createEntityManager();
      Owner owner = entityManager.find(Owner.class, 1);
      if(owner==null){
    	  System.out.println("No object found");
      }else{
    	  System.out.println(owner.getVehicle().getVehicle_name());
      }
      
        entityManager.close();
        factory.close();
	}

}
