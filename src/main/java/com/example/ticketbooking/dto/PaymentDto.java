package com.example.ticketbooking.dto;

import com.example.ticketbooking.entity.Ticket;
import com.example.ticketbooking.entity.User;
import com.example.ticketbooking.enums.PaymentStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private Long id;

    private User user;

    private Ticket ticket;

    private BigDecimal amount;

    private PaymentStatus status;

    private LocalDateTime paymentDate;
}
