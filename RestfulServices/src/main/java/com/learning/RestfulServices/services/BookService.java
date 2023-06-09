package com.learning.RestfulServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.RestfulServices.dao.BookDAO;
import com.learning.RestfulServices.entity.Book;

@Service
public class BookService {
   //BookDAO bookDao = new BookDAO();
	@Autowired
	private BookDAO bookDao;
	
	public List<Book> getBooks(){
		return bookDao.getAll();
	}
	
	public Book getBookById(int id){
		return bookDao.getById(id);
	}
	
	public String addBook(Book book){
		return bookDao.addBook(book);
	}
	
	
	public String deleteBook(int id){
		return bookDao.deleteBook(id);
	}
	
	public String updateBook(int id,Book newBook){
		return bookDao.updateBook(id, newBook);
	}
	
}
