package com.exercicio.informatic.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exercicio.informatic.model.Computer;
import com.exercicio.informatic.service.IComputerService;
import com.exercicio.informatic.service.impl.ComputerServiceImpl;


@CrossOrigin("*")

@RestController
public class ComputerController {
	IComputerService computerService = new ComputerServiceImpl();
	@GetMapping("/computer/")
	public List<Computer> getAll(){
		return computerService.getAll();
	}
	
	@GetMapping("/computer/{id}")
	public ResponseEntity<Computer> getById(@PathVariable int id) {
		Computer computer = computerService.getById(id);
		
		if(computer == null)
			ResponseEntity.notFound();
		
		return ResponseEntity.ok(computer);
	}
	@PostMapping("/computer/")
	public ResponseEntity<Computer>  insert(@RequestBody Computer computer) {
		if(computer.getId() != 0)
			return ResponseEntity.badRequest().body(computer);
		
		computerService.insert(computer);		
		return ResponseEntity.ok(computer);
	}
	@PutMapping("/computer/")
	public Computer alterar(@RequestBody Computer computer) {
		computerService.update(computer);
		return computer;
	}
	
	@DeleteMapping("/computer/{id}")
	public void delete(@PathVariable int id) {
		computerService.delete(id);
	}
	
		
}
