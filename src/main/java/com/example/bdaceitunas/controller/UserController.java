package com.example.bdaceitunas.controller;

import com.example.bdaceitunas.entity.User;
import com.example.bdaceitunas.repository.UserRepository;
import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserRepository usuarioRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserController(UserRepository usuarioRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.usuarioRepository = usuarioRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@PostMapping("/users/")
	public void saveUser(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		usuarioRepository.save(user);
	}

	@GetMapping("/users/")
	public List<User> getAllUsers() {
		return usuarioRepository.findAll();
	}

	@GetMapping("/users/{username}")
	public User getUser(@PathVariable String username) {
		return usuarioRepository.findByUsername(username);
	}
}
