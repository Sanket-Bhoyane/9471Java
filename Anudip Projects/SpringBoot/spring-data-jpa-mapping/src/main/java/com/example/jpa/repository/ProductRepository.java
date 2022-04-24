package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
