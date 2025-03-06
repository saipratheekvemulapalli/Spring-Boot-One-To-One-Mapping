package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Student;
import com.example.demo.repository.StudentRepo;


@Service
@Primary
public class StudentserviceImpl implements Studentservice {
	
	@Autowired
	StudentRepo studentrepo;




	@Override
	public Student addstudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public List<Student> viewallstudents() {
		
		return (List<Student>) studentrepo.findAll();
	}

	@Override
	public Student viewstudentbyid(int studid) {
		return studentrepo.findById(studid).get();
	}

	@Override
	public Student updatestudent(int studid, Student student) {
		
		return studentrepo.save(student);
	}

	@Override
	public void deletestudentbyid(int studid) {
		studentrepo.deleteById(studid);
	}


	
	
}
