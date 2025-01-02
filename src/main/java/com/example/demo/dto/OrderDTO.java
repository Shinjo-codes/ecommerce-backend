package com.example.demo.dto;


import com.example.demo.model.Order;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    @NotBlank(message = "Address is required")
    private String address;
    @NotBlank(message = "PhoneNumber is required")
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDate createdAt;
    private List<OrderItemDTO> orderItems;


}
