package com.example.orderser.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrderResponse {
    private Long id;
    private String name;
    private Double qty;
}
