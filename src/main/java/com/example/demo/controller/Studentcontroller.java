package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Student;
import com.example.demo.service.Studentservice;






@RestController
@RequestMapping(value = "/student")
public class Studentcontroller {
	
	@Autowired
	Studentservice studentservice;
	
	
	@PostMapping(value = "/addstudent")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Student addstudent(@RequestBody Student student) {
		return studentservice.addstudent(student);
	}
	
	
	
	@GetMapping(value = "/getallstudents")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Student>viewallstudents(){
		return studentservice.viewallstudents();
		
	}

	@GetMapping(value = "/getstudentbyid")
	@ResponseStatus(value = HttpStatus.OK)
	public Student viewstudentbyid(@PathVariable int studid) {
		return studentservice.viewstudentbyid(studid);
	}
	
	
	
	
	@PutMapping(value = "/updatestudbyid")
	@ResponseStatus(value = HttpStatus.OK)
	public Student updatestudent(@PathVariable int studid, @RequestBody Student student) {
		return studentservice.updatestudent(studid, student);	
	}
	@DeleteMapping(value = "/deletestudbyid")
	@ResponseStatus(value = HttpStatus.OK)
	public void deletestudbyid(@PathVariable int studid) {
		studentservice.deletestudentbyid(studid);
	}
	
}
