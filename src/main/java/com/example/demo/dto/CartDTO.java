package com.example.demo.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class CartDTO {
    private Long id;
    @NotBlank(message = "UserId cannot be blank")
    private Long userId;
    private List<CartItemDTO> items;

}
