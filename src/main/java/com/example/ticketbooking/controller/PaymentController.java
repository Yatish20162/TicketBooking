package com.example.ticketbooking.controller;

import com.example.ticketbooking.dto.PaymentDto;
import com.example.ticketbooking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/")
    public List<PaymentDto> getAllPayments(){
        return paymentService.getAllPayments();
    }
}
