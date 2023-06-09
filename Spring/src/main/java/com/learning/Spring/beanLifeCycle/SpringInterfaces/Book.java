package com.learning.Spring.beanLifeCycle.SpringInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean,DisposableBean{
    private int bookId;
    private String bookName;
	Book(){
		System.out.println("book created");
	}

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
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet() method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy() method");
		
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
}
