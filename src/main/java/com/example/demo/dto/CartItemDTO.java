package com.example.demo.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    @NotBlank(message = "ProductId cannot be empty")
    private Long productId;
    @Positive(message = "Cannot be Zero")
    private Integer quantity;


}
