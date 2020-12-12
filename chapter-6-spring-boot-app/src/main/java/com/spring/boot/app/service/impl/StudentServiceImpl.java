package com.spring.boot.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.app.dao.StudentDao;
import com.spring.boot.app.dao.entity.Student;
import com.spring.boot.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentHibernateDao;
	
	
	@Override
	public List<Student> getAll() {
		
		return studentHibernateDao.getAll();
	}

}
