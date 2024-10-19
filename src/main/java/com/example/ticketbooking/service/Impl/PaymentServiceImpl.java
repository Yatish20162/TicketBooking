package com.example.ticketbooking.service.Impl;

import com.example.ticketbooking.dto.PaymentDto;
import com.example.ticketbooking.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    /**
     * @return
     */
    @Override
    public List<PaymentDto> getAllPayments() {
        return List.of();
    }
}
