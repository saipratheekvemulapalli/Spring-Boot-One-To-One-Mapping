package com.example.demo.service;

import org.hibernate.mapping.List;

import com.example.demo.POJO.Books;

public interface Bookservice {
	
	
	public Books addbooks(Books books);
	
	public java.util.List<Books> viewall();
	 
	public Books getbookbyid(int id);
	
	public void deletebookbyid(int id);
	
	public Books updatebooks(int id, Books books);
	
	//public Books getbookbyauthor(String author);
	
	
}
