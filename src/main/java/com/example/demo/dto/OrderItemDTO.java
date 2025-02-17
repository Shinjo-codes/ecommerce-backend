package com.example.demo.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {

    private Long id;
    private Long productId;
    @Positive(message = "Quantity is required")
    private Integer quantity;
    @Positive(message = "Price is required")
    private BigDecimal price;

}
