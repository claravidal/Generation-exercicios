package com.exercise.school.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exercise.school.entity.Shift;

public interface ShiftRepository extends CrudRepository<Shift, Integer> {

	Shift findShiftByName(String name);

	List<Shift> findAllByName(String name);


}
