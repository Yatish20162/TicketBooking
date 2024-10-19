package com.example.ticketbooking.dto;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private Long id;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private String genre;
    private BigDecimal rating;
    private Integer duration;
}
