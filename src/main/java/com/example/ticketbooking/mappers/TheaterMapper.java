package com.example.ticketbooking.mappers;

import com.example.ticketbooking.dto.TheaterDto;
import com.example.ticketbooking.entity.Theater;

public class TheaterMapper {
    public static TheaterDto mapToTheaterDto(Theater theater , TheaterDto theaterDto){
        theaterDto.setName(theater.getName());
        theaterDto.setId(theater.getId());
        theaterDto.setLocation(theater.getLocation());
        return theaterDto;
    }
    public static Theater mapToTheaterEntity(Theater theater , TheaterDto theaterDto){
        theater.setId(theaterDto.getId());
        theater.setId(theaterDto.getId());
        theater.setLocation(theaterDto.getLocation());
        return theater;
    }
}
