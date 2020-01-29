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

import com.exercise.school.entity.Classe;
import com.exercise.school.entity.Student;
import com.exercise.school.service.ClasseService;

@RestController
@CrossOrigin("*")

public class ClasseController {
	
	@Autowired
	private ClasseService service;
	
	@PostMapping("/classe")
	public ResponseEntity<Classe> post(@RequestBody Classe entity){
		try {
			Classe classeSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(classeSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/classe")
	public ResponseEntity<Classe> put(@RequestBody Classe entity){
		try {
			Classe classeSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(classeSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/classe/{id}")
	
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
	
	@GetMapping("/classe/{id}")
	public ResponseEntity<Classe> getById(@PathVariable int id){
		Classe classe = this.service.getById(id);
		
		if(classe == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(classe);
	}
	
	@GetMapping("/classe")
	public ResponseEntity<List<Classe>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/classe/names/{name}")
	public ResponseEntity<List<Classe>> getAllByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getAllByName(name));
	}
	
	@GetMapping("/classe/name/{name}")
	public ResponseEntity<Classe> getByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getByName(name));
	}
	
}
