package com.example.ticketbooking.dto;

import com.example.ticketbooking.entity.MovieShow;
import com.example.ticketbooking.entity.User;
import com.example.ticketbooking.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {
    private Long id;

    private MovieShow movieShow;

    private User user;

    private String seatNumber;

    private BookingStatus bookingStatus;

    private LocalDateTime bookedAt;
}
