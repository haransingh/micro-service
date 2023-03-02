package com.example.orderser.controller;

import com.example.orderser.dto.SaveOrderRequest;
import com.example.orderser.dto.SaveOrderResponse;
import com.example.orderser.entity.Order;
import com.example.orderser.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public String getMessage() {
        return "hello order from";
    }

    @PostMapping
    public SaveOrderResponse saveOrder(@RequestBody SaveOrderRequest request) {
        return orderService.saveOrder(request);
    }
}
