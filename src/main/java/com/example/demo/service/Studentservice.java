package com.example.demo.service;

import java.util.List;

import com.example.demo.POJO.Student;
import com.example.demo.repository.StudentRepo;

public interface Studentservice  {
	
	
	
	public Student addstudent(Student student);
	
	public List<Student> viewallstudents();
	
	public Student viewstudentbyid(int studid);
	
	public Student updatestudent(int studid, Student student);
	
	public void deletestudentbyid(int studid);
	
}
