package com.example.demo.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Books;
import com.example.demo.repository.BooksRepo;

@Service
@Primary
public class BookserviceImpl implements Bookservice{
	
	@Autowired
	BooksRepo booksrepo;

	@Override
	public java.util.List<Books> viewall() {
		return (java.util.List<Books>) booksrepo.findAll();
	}
	
	
	public Books getbookbyid(int id) {
		return booksrepo.findById(id).get();
	}
	
	@Override
	public Books addbooks(Books books) {
		
		return booksrepo.save(books);
	}

	@Override
	public void deletebookbyid(int id) {
		booksrepo.deleteById(id);
		
	}

	@Override
	public Books updatebooks(int id, Books books) {
		
		return booksrepo.save(books);
	}


//	@Override
//	public Books getbookbyauthor(String author) {
//		
//		return booksrepo.findbyauthor(author);
//	}
	
	
	
	
	
	
	
}
