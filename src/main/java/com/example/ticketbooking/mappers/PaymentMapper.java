package com.example.ticketbooking.mappers;

import com.example.ticketbooking.dto.PaymentDto;
import com.example.ticketbooking.entity.Payment;

public class PaymentMapper {
    public static PaymentDto mapToMovieDto(Payment payment , PaymentDto paymentDto){
        paymentDto.setPaymentDate(payment.getPaymentDate());
        paymentDto.setId(payment.getId());
        paymentDto.setUser(payment.getUser());
        paymentDto.setAmount(payment.getAmount());
        paymentDto.setStatus(payment.getStatus());
        paymentDto.setTicket(payment.getTicket());
        return paymentDto;
    }
    public static Payment mapToMovieEntity(Payment payment , PaymentDto paymentDto){
        payment.setPaymentDate(paymentDto.getPaymentDate());
        payment.setId(paymentDto.getId());
        payment.setUser(paymentDto.getUser());
        payment.setAmount(paymentDto.getAmount());
        payment.setStatus(paymentDto.getStatus());
        payment.setTicket(paymentDto.getTicket());
        return payment;
    }
}
