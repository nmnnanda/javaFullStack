package com.learning.JPA.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Comment c1 = new Comment();
		c1.setUsername("Akhil");
		c1.setComment_desc("AI is future");
		
		Comment c2 = new Comment();
		c2.setUsername("Arjun");
		c2.setComment_desc("AI can be dangerous");
		
		Comment c3 = new Comment();
		c3.setUsername("Archana");
		c3.setComment_desc("Human species will be in danger");
		
		List<Comment> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Post post = new Post();
		post.setPost_name("AI");
		post.setComments(list);
		
		
		
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa_pu");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(post);
		entityTransaction.commit();
		System.out.println("Object saved successfully");
		
		entityManager.close();
		factory.close();

	}

}
