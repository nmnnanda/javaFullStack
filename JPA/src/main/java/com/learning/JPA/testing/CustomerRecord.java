package com.learning.JPA.testing;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Customer;
import com.learning.JPA.entity.Product;

public class CustomerRecord {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductName("iphone14 pro");
		p1.setProductCategory("Mobiles");
		
		
		Product p2 = new Product();
		p2.setProductName("Macbook");
		p2.setProductCategory("Laptop");
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		
		
		Customer c1 = new Customer();
		c1.setCustomerName("anil");
		c1.setProducts(products);
		
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa_pu");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(c1);
		transaction.commit();
		
		System.out.println("Object saved successfully..");
		entityManager.close();
		factory.close();
		
		
		
		
		
		

	}

}
