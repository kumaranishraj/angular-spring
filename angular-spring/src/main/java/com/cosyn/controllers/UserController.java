package com.cosyn.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosyn.model.User;
import com.cosyn.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("{/api}")
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	 @GetMapping("/users")
	    public List<User> getAllEmployees() {
	        return userRepository.findAll();
	    }
	
	@PostMapping("/users")
	public User create(@RequestBody User user) {
		System.out.println(user);
		return userRepository.save(user);
	}
	
//	@GetMapping("/users")
//	public User create() {
//		User user=new User();
//		user.setName("Anish");
//		user.setPassword("abc");
//		return userRepository.save(user);
//	}
}
