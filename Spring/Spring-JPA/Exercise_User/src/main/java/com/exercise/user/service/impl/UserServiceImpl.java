package com.exercise.user.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.user.entity.User;
import com.exercise.user.repository.UserRepository;
import com.exercise.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public User insertOrUpdate(User entity) {
	 User usersave = this.repository.save(entity);
		return usersave;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<User> getAll() {
		return (List<User>) this.repository.findAll();

	}

	@Override
	public User getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<User> getAllByName(String name) {
		return (List<User>)this.repository.findAllByName(name);
	}

	@Override
	public User getByName(String name) {
		return this.repository.findUserByName(name);
	}
	

}
