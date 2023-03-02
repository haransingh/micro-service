package com.example.orderser.service;

import com.example.orderser.dto.SaveOrderRequest;
import com.example.orderser.dto.SaveOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;


    public SaveOrderResponse saveOrder(SaveOrderRequest request) {
        System.out.println("request " +request.toString());

       String re =   restTemplate.getForObject("http://localhost:8081/payment", String.class);
        System.out.println("re" + re);
        return null;
    }
}
