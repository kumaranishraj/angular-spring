package com.cosyn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosyn.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
