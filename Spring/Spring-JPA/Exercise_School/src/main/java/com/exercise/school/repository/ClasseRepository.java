package com.exercise.school.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exercise.school.entity.Classe;


public interface ClasseRepository extends CrudRepository <Classe , Integer> {
	Classe findClasseByName(String name);

	List<Classe> findAllByName(String name);
	
}


