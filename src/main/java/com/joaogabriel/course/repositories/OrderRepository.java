package com.joaogabriel.course.repositories;

import com.joaogabriel.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
