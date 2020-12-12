package com.spring.boot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.app.dao.entity.Student;
import com.spring.boot.app.service.StudentService;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Student> studentList = studentService.getAll();
		
		for(Student student : studentList) {
			System.out.println(student);
		}
	}

}
