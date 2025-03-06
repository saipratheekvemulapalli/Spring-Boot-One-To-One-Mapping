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
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
@Primary
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bookname;
	private String author;
	private int price;
	private int edition;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studid_id")
	@JsonManagedReference
	private Student student;
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
	
}
