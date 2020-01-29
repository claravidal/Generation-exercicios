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
import com.exercise.school.entity.Shift;
import com.exercise.school.service.ShiftService;

@RestController
@CrossOrigin("*")
public class ShiftController {
	@Autowired
	private ShiftService service;
	
	@PostMapping("/shift")
	public ResponseEntity<Shift> post(@RequestBody Shift entity){
		try {
			Shift shiftSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(shiftSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	@PutMapping("/shift")
	public ResponseEntity<Shift> put(@RequestBody Shift entity){
		try {
			Shift shiftSave = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(shiftSave);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/shift/{id}")
	
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
	
	@GetMapping("/shift/{id}")
	public ResponseEntity<Shift> getById(@PathVariable int id){
		Shift shift = this.service.getById(id);
		
		if(shift == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(shift);
	}
	
	@GetMapping("/shift")
	public ResponseEntity<List<Shift>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/shift/names/{name}")
	public ResponseEntity<List<Shift>> getAllByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getAllByName(name));
	}
	
	@GetMapping("/shift/name/{name}")
	public ResponseEntity<Shift> getByName(@PathVariable String name){
		return ResponseEntity.ok(this.service.getByName(name));
	}
	
	
	
	
}
