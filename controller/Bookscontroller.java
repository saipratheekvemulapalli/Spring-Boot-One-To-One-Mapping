package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Books;
import com.example.demo.service.Bookservice;

@RestController
public class Bookscontroller {
	
	@Autowired
	Bookservice bookservice;
	
	@GetMapping("/serachbookbyid/{id}")
	private Books getbookbyid(@PathVariable("bookid") int bookid) {
		return bookservice.getbookbyid(bookid);
	}
	@GetMapping("/deletebookbyid/{id}")
	private void deletebookbyid(@PathVariable("bookid") int bookid) {
		bookservice.deletebook(bookid);
	}
	@GetMapping("/Allbooks")
	private Books getallbooks() {
		return bookservice.getallbooks();
	}
	@GetMapping("/Savebook")
	private int savebooks(@RequestBody Books books) {
		bookservice.savebook(books);
		return books.getBookid();
	}
	@GetMapping("/updatebooks")
	private Books update(@RequestBody Books books) {
		bookservice.savebook(books);
		return books;
	}
	
}
