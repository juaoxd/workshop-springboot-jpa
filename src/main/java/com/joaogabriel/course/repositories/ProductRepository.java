 package com.joaogabriel.course.repositories;

 import com.joaogabriel.course.entities.Product;
 import org.springframework.data.jpa.repository.JpaRepository;

 public interface ProductRepository extends JpaRepository<Product, Long> {

 }
