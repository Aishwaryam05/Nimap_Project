package com.nimap.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}