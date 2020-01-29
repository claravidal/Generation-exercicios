package com.exercise.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercise.user.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {

}
