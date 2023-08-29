package com.joaogabriel.course.repositories;

import com.joaogabriel.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
