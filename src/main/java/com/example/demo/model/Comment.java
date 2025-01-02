package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Long userId;
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)//One product can have lots of comments.
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)//One user can write lots of comments
    private User user;


}
