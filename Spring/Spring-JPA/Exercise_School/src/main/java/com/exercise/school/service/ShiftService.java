package com.exercise.school.service;

import java.util.List;

import com.exercise.school.entity.Shift;


public interface ShiftService{

	Shift insertOrUpdate(Shift entity);

	void delete(int id);

	List<Shift> getAll();

	Shift getById(int id);

	List<Shift> getAllByName(String name);

	Shift getByName(String name);
}

