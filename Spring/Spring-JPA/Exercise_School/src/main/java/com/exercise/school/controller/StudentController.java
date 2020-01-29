package com.exercise.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.school.entity.Student;
import com.exercise.school.service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/student")
	public ResponseEntity<Student> post(@RequestBody Student entity){
		try {
			Student studentSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(studentSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> put(@RequestBody Student entity){
		try {
			Student studentSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(studentSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/student/{id}")
	
	public ResponseEntity<String> delete(@PathVariable int id){
		if(this.service.getById(id) == null) {
			return ResponseEntity.notFound().build();
		}
		
		try {
			this.service.delete(id);
			return ResponseEntity.ok("Removido com sucesso.");
		} catch (Exception err) {
			return ResponseEntity.badRequest().body(err.getMessage());
		}
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getById(@PathVariable int id){
		Student student = this.service.getById(id);
		
		if(student == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(student);
	}
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/student/names/{name}")
	public ResponseEntity<List<Student>> getAllByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getAllByName(name));
	}
	
	@GetMapping("/student/name/{name}")
	public ResponseEntity<Student> getByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getByName(name));
	}
	

}
