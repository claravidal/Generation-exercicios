package com.exercise.user.service;

import java.util.List;

import com.exercise.user.entity.State;

public interface StateService {

	State insertOrUpdate(State entity);

	void delete(int id);

	List<State> getAll();

	State getById(int id);

	List<State> getAllByName(String name);

	State getByName(String name);
	
}
