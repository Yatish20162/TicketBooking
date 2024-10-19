package com.example.ticketbooking.service.Impl;

import com.example.ticketbooking.dto.TheaterDto;
import com.example.ticketbooking.entity.Theater;
import com.example.ticketbooking.mappers.TheaterMapper;
import com.example.ticketbooking.repository.TheaterRepository;
import com.example.ticketbooking.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;
@Service
public class TheaterServiceImpl implements TheaterService {
    @Autowired
    TheaterRepository theaterRepository;
    /**
     * @return
     */
    @Override
    public List<TheaterDto> getAllTheaters() {
        List<TheaterDto> theaterDtoList= new ArrayList<>();
        for (Theater theater : theaterRepository.findAll()){
            TheaterDto theaterDto = new TheaterDto();
            TheaterMapper.mapToTheaterDto(theater , theaterDto);
            theaterDtoList.add(theaterDto);
        }
        return theaterDtoList;
    }

    /**
     * @param location
     * @return
     */
    @Override
    public List<TheaterDto> getTheaterBasedOnLocation(String location) {
        return List.of();
    }
}
