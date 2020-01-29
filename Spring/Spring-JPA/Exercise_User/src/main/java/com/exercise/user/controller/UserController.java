package com.exercise.user.controller;

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
import com.exercise.user.entity.User;
import com.exercise.user.service.UserService;


@RestController
@CrossOrigin("*")

public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public ResponseEntity<User> post(@RequestBody User entity){
		try {
			User userSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(userSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null );
		}
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> put(@RequestBody User entity){
		try {
			User userSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(userSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/user/{id}")
	
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
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getById(@PathVariable int id){
		User state = this.service.getById(id);
		
		if(state == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(state);
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/user/names/{name}")
	public ResponseEntity<List<User>> getAllByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getAllByName(name));
	}
	
	@GetMapping("/user/name/{name}")
	public ResponseEntity<User> getByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getByName(name));
	}
	
}
