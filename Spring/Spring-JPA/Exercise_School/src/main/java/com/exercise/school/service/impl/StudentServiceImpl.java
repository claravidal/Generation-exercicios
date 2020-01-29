package com.exercise.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.school.entity.Student;
import com.exercise.school.repository.StudentRepository;
import com.exercise.school.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	@Override
	public Student insertOrUpdate(Student entity) {
		Student studentsave = this.repository.save(entity);
		return studentsave;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Student> getAll() {
		return (List<Student>) this.repository.findAll();
	}

	@Override
	public Student getById(int id) {
		return this.repository.findById(id).orElse(null);
	}
 
	@Override
	public List<Student> getAllByName(String name) {
		return (List<Student>)this.repository.findAllByName(name);
	}

	@Override
	public Student getByName(String name) {
		return this.repository.findStudentByName(name);
	}

	
}
