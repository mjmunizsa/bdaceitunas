package com.example.bdaceitunas.repository;

import com.example.bdaceitunas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
