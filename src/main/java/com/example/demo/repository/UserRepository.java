package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Lazy
public interface UserRepository extends JpaRepository<User, Long> {

        Optional<User> findByEmail(String email);

}
