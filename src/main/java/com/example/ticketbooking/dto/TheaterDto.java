package com.example.ticketbooking.dto;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TheaterDto {
    private Long id;

    private String name;

    private String location;
}
