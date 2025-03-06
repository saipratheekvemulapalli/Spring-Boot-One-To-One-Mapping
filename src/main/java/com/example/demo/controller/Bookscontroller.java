package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Books;
import com.example.demo.service.Bookservice;

@RestController

@RequestMapping(value = "books")

@CrossOrigin(origins = "http://localhost:4200")
public class Bookscontroller {
	
	@Autowired
	Bookservice bookservice;
	
	@PostMapping(value = "/addbook")
	@ResponseStatus(value=HttpStatus.CREATED)
	public Books addBook(@RequestBody Books books) {
		return bookservice.addbooks(books);
	}
	
	@GetMapping(value = "/fetchallbooks")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Books> findallbooks(){
		return bookservice.viewall();
	}
	
	@GetMapping(value = "/fetchbookbyid/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Books getbooksbyid(@PathVariable int id) {
		return bookservice.getbookbyid(id);
	}

//	@GetMapping(value = "/fetchbookbyauthor/{author}")
//	@ResponseStatus(value = HttpStatus.OK)
//	public Books getbooksbyauthor(@RequestBody String author) {
//		return bookservice.getbookbyauthor(author);
//		
//	}
	
	
	
	@PutMapping(value = "/updatebooks")
	@ResponseStatus(value = HttpStatus.OK)
	public Books updatebooks(@PathVariable int id,@RequestBody Books books) {
		return bookservice.updatebooks(id, books);
	}
	
	@DeleteMapping(value = "/deletebyid/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deletebyid(@PathVariable int id) {
		 bookservice.deletebookbyid(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
