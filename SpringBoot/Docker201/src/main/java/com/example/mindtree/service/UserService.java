package com.example.mindtree.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mindtree.entity.User;
import com.example.mindtree.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findById(Integer id) {
		Optional<User> user = repository.findById(id);

		if (user != null) {
			return user.get();
		}
		return null;
	}

	public List<User> findAll() {
		List<User> user = repository.findAll();

		if (user != null && !user.isEmpty()) {
			return user;
		}
		return null;
	}
}
