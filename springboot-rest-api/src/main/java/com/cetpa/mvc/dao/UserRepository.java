package com.cetpa.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.mvc.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUsername(String username);

}
