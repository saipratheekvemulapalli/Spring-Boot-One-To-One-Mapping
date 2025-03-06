package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Books;


@Repository
public interface BooksRepo extends CrudRepository<Books, Integer> {
	
	//public Books findbyauthor(String author);
	
}
