package com.vivekt.db.demo.repo;


import com.vivekt.db.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
