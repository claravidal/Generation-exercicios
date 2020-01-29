package com.exercise.user.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.exercise.user.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findUserByName(String name);

	List<User> findAllByName(String name);

}
