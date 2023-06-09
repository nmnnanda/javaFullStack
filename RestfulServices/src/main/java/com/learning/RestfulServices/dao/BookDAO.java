package com.learning.RestfulServices.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning.RestfulServices.entity.Book;

@Repository
public class BookDAO {
	static List<Book> list = new ArrayList<>();
	static{
	
		list.add(new Book(1,"Spring In Action","James"));
		list.add(new Book(2,"SpringBoot In Action","John"));
		list.add(new Book(3,"JPA In Action","Richard"));
		
	}
	
	public List<Book> getAll(){
		return list;
	}
	
	public Book getById(int id){
     return  list.stream()
		    .filter(obj->obj.getBookId()==id)
		    .findFirst().get();
	}
	
	public String  addBook(Book book){
		boolean result =  list.add(book);
		if(result){
			return "Book with the id "+book.getBookId()+" saved successfully";
		}
		return "Something went wrong";
	}
	
	
	public String deleteBook(int id){
		Book searchedBook = list.stream()
		                   .filter(obj->obj.getBookId()==id)
		                   .findFirst().get();
		
		if(searchedBook!=null){
			list.remove(searchedBook);
			return "Book with id "+id+" deleted successfully";
		}
		return "Book not found";
	}
	
	
	
	public String updateBook(int id,Book newBook){
		Book oldBook =   list.stream()
		                 .filter(obj->obj.getBookId()==id)
		                 .findFirst().get();
		
		if(oldBook!=null){
			oldBook.setBookName(newBook.getBookName());
			oldBook.setBookAuthor(newBook.getBookAuthor());
			list.add(oldBook);
			return "Book updated successfully";
		}
		return "Something went wrong";
	}
	
	
	

}
