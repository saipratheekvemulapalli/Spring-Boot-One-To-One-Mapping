package com.example.demo.POJO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studid;
	private String Studname;
	private int year;
	
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	@JsonBackReference
	private Books books;

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}
	
	public String getStudname() {
		return Studname;
	}

	public void setStudname(String studname) {
		Studname = studname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	
}
