package com.exercise.school.service;

import java.util.List;

import com.exercise.school.entity.Classe;

public interface ClasseService {
	Classe insertOrUpdate(Classe entity);

	void delete(int id);

	List<Classe> getAll();

	Classe getById(int id);

	List<Classe> getAllByName(String name);

	Classe getByName(String name);
}

