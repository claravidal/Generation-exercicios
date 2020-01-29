package com.exercise.beautyShop.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.exercise.beautyShop.model.Fragrance;
import com.exercise.beautyShop.service.IFragranceService;
import com.exercise.beautyShop.service.impl.FragranceServiceImpl;

@CrossOrigin
@RestController

public class FragranceController {
	IFragranceService fragranceService = new FragranceServiceImpl();

	@GetMapping("/fragrance/")
	public List<Fragrance> getAll() {
		return fragranceService.getAll();
	}

	@PostMapping("/fragrance/")
	public ResponseEntity<Fragrance> insert(@RequestBody Fragrance fragrance) {
		if (fragrance.getId() != 0)
			return ResponseEntity.badRequest().body(fragrance);

		fragranceService.insert(fragrance);
		return ResponseEntity.ok(fragrance);
	}

	@PutMapping("/fragrance/")
	public Fragrance alterar(@RequestBody Fragrance fragrance) {
		fragranceService.update(fragrance);
		return fragrance;
	}

	@DeleteMapping("/fragrance/{id}")
	public void delete(@PathVariable int id) {
		fragranceService.delete(id);

	}
}