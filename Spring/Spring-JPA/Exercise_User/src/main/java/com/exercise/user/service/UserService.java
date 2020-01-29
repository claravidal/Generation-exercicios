package com.exercise.user.service;
import java.util.List;
import com.exercise.user.entity.User;


public interface UserService {

	User insertOrUpdate(User entity);

	void delete(int id);

	List<User> getAll();

	User getById(int id);

	List<User> getAllByName(String name);

	User getByName(String name);
}
