package com.cetpa.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.mvc.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
