package com.springsecuritydemo.project.persistence.repositories;

import com.springsecuritydemo.project.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
