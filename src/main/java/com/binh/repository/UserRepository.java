package com.binh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binh.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String username);
	
}
