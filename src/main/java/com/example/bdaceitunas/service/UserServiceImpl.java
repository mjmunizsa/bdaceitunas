package com.example.bdaceitunas.service;

import com.example.bdaceitunas.entity.User;
import com.example.bdaceitunas.repository.UserRepository;
import java.util.Collections;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository usuarioRepository;

	private ModelMapper mapper;

	public UserServiceImpl(UserRepository usuarioRepository, ModelMapper mapper) {

		this.usuarioRepository = usuarioRepository;
		this.mapper = mapper;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User usuario = usuarioRepository.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new org.springframework.security.core.userdetails.User(usuario.getUsername(),
			usuario.getPassword(),
			Collections.emptyList());
	}
}