package com.example.demo.repository;

import com.example.demo.model.Cart;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Lazy
public interface CartRepository extends JpaRepository<Cart, Long> {

       Optional<Cart> findByUserId(Long userId);
}
