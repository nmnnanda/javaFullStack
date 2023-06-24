 package com.learning.Spring.beanLifeCycle.byAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {
   private int bookId;
   private String bookName;
public int getBookId() {
	return bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
}

@PostConstruct
public void init(){
	System.out.println("init() method called");
}

@PreDestroy
public void destroy(){
	System.out.println("destroy() method is called");
}
   
}
