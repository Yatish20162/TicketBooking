package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.PaymentDto;

import java.util.List;

public interface PaymentService {
    public List<PaymentDto> getAllPayments();
}
