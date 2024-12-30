package com.example.demo.dto;

import lombok.Data;

@Data
public class CommentDTO {

    private Long id;
    private String content;
    private Long userId;
    private Integer score;
}
