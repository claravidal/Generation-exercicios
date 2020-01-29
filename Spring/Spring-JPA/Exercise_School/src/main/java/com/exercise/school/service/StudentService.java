package com.exercise.school.service;

import java.util.List;
import com.exercise.school.entity.Student;

public interface StudentService {
	
	Student insertOrUpdate(Student entity);

	void delete(int id);

	List<Student> getAll();

	Student getById(int id);

	List<Student> getAllByName(String name);

	Student getByName(String name);
}
