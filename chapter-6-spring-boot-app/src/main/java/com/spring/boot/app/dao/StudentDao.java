package com.spring.boot.app.dao;

import java.util.List;

import com.spring.boot.app.dao.entity.Student;

public interface StudentDao {

	public List<Student> getAll();
}
