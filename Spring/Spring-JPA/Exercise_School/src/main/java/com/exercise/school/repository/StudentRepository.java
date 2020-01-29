package com.exercise.school.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.exercise.school.entity.Student;

public interface StudentRepository extends CrudRepository <Student , Integer> {
	  
		List<Student>findAllByName(String name);
		Student findStudentByName(String name);
}
