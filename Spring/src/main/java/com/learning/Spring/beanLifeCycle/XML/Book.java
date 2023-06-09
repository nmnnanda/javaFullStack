package com.learning.Spring.beanLifeCycle.XML;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    
    Book(){
    	System.out.println("Book created");
    }
    
    Book(int bookId,String bookName,String bookAuthor){
    	this.bookId = bookId;
    	this.bookName = bookName;
    	this.bookAuthor = bookAuthor;
    	System.out.println("Book created");
    }
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookId(int bookId) {
		System.out.println("Setting the value of bookId");
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		System.out.println("Setting the value of bookName");
		this.bookName = bookName;
	}
	public void setBookAuthor(String bookAuthor) {
		System.out.println("Setting the value of bookAuthor");
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
    
	public void initMethod(){
		System.out.println("Book is in init phase");
	}
	
	public void destroyMethod(){
		System.out.println("Book is in destruction phase");
	}
	
}
