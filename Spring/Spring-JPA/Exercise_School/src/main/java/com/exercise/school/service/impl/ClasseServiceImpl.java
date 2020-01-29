package com.exercise.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.school.entity.Classe;
import com.exercise.school.repository.ClasseRepository;
import com.exercise.school.service.ClasseService;

@Service
public class ClasseServiceImpl implements ClasseService {

	@Autowired
	private ClasseRepository repository;

	@Override
	public Classe insertOrUpdate(Classe entity) {
		Classe classesave = this.repository.save(entity);
		return classesave;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);

	}

	@Override
	public List<Classe> getAll() {
		return (List<Classe>) this.repository.findAll();
	}
	

	@Override
	public Classe getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Classe> getAllByName(String name) {
		return (List<Classe>)this.repository.findAllByName(name);
	}

	@Override
	public Classe getByName(String name) {
		return this.repository.findShiftByName(name);
	}
}
