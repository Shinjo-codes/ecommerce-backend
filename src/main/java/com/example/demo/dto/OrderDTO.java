package com.example.demo.dto;


import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    private String address;
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDate createdAt;
    private List<OrderItemDTO> orderItems;


}
