package com.example.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mindtree.entity.User;
import com.example.mindtree.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/get/{id}")
	@ResponseBody
	public User getUserById(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}

	@GetMapping("/getAll")
	@ResponseBody
	public List<User> getUserById() {
		return service.findAll();
	}
}
