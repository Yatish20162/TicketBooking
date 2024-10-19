package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.TheaterDto;

import java.util.List;

public interface TheaterService {
    public List<TheaterDto> getAllTheaters();
    public List<TheaterDto> getTheaterBasedOnLocation(String location);
}
