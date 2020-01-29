package com.exercise.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.school.entity.Shift;
import com.exercise.school.repository.ShiftRepository;
import com.exercise.school.service.ShiftService;



@Service
public class ShiftServiceImpl implements ShiftService {

	@Autowired
	private ShiftRepository repository;

	@Override
	public Shift insertOrUpdate(Shift entity) {
		Shift shiftsave = this.repository.save(entity);
		return shiftsave;
	}
	

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Shift> getAll() {
		return (List<Shift>) this.repository.findAll();
	}

	@Override
	public Shift getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Shift> getAllByName(String name) {
		return (List<Shift>)this.repository.findAllByName(name);
	}

	@Override
	public Shift getByName(String name) {
		return this.repository.findShiftByName(name);
	}
}
	