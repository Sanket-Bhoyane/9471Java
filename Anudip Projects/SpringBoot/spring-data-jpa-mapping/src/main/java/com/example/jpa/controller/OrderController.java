package com.example.jpa.controller;

import java.util.List;

import com.example.jpa.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.dto.OrderRequest;
import com.example.jpa.entity.Customer;
import com.example.jpa.repository.CustomerRepository;
import com.example.jpa.repository.ProductRepository;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepository.save(request.getCustomer());

    }
    @GetMapping("/findAllOrders")
    public List<Customer>findAllOrders(){

        return customerRepository.findAll();
    }
    @GetMapping("/getInfo")
    public List<OrderResponse>getJoinInfo(){
        return customerRepository.getJoinInfo();
}}
