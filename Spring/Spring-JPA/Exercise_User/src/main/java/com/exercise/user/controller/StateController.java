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

import com.exercise.user.entity.State;
import com.exercise.user.service.StateService;


@RestController
@CrossOrigin("*")

public class StateController {

	@Autowired
	private StateService service;
	
	@PostMapping("/state")
	public ResponseEntity<State> post(@RequestBody State entity){
		try {
			State stateSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(stateSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null );
		}
	}
	
	@PutMapping("/state")
	public ResponseEntity<State> put(@RequestBody State entity){
		try {
			State stateSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(stateSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/state/{id}")
	
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
	
	@GetMapping("/state/{id}")
	public ResponseEntity<State> getById(@PathVariable int id){
		State state = this.service.getById(id);
		
		if(state == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(state);
	}
	
	@GetMapping("/state")
	public ResponseEntity<List<State>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/state/names/{name}")
	public ResponseEntity<List<State>> getAllByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getAllByName(name));
	}
	
	@GetMapping("/state/name/{name}")
	public ResponseEntity<State> getByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getByName(name));
	}
	
}
