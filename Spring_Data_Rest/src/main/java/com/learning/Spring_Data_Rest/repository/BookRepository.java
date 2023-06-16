package com.learning.Spring_Data_Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learning.Spring_Data_Rest.entity.Book;

@CrossOrigin(origins="*")
@RepositoryRestResource(path="coolbooks",collectionResourceRel="newBooks")
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBybookName(String name);
    Book findBybookAuthor(String bookAuthor);
}
