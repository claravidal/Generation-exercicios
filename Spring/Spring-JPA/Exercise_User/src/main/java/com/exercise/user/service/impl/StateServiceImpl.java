package com.exercise.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.user.entity.State;
import com.exercise.user.repository.StateRepository;
import com.exercise.user.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository repository;
	@Override
	public State insertOrUpdate(State entity) {
		State statesave = this.repository.save(entity);
		return statesave;
	}
				

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<State> getAll() {
		return (List<State>) this.repository.findAll(); 
	}

	@Override
	public State getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<State> getAllByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
