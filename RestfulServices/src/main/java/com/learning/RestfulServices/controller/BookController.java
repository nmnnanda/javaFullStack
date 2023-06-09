package com.learning.RestfulServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.RestfulServices.entity.Book;
import com.learning.RestfulServices.services.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookController {
   //BookService bookService = new BookService();
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public List<Book> getBook(){
		return bookService.getBooks();
	}
	
	

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable int id){
		Book book = bookService.getBookById(id);
		if(book!=null){
			return book;
		}
		return null;
	}
	
	@PostMapping("/book")
	public String saveBook(@RequestBody Book book){
		return bookService.addBook(book);
		
	}
	
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id){
		return bookService.deleteBook(id);
	}
	
	@PutMapping("/book/{id}")
	public String updateBook(@PathVariable int id,@RequestBody Book newBook){
		return bookService.updateBook(id, newBook);
	}
	
	
}
