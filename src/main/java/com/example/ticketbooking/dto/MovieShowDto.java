package com.example.ticketbooking.dto;

import com.example.ticketbooking.entity.Movie;
import com.example.ticketbooking.entity.Theater;
import lombok.*;

import java.time.LocalDateTime;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieShowDto {
    private Long id;

    private Movie movie;

    private Theater theater;

    private LocalDateTime showTime;

    private Integer availableSeats;
}
