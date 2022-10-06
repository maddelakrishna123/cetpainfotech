package com.cetpa.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.mvc.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
