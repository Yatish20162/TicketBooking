package com.example.ticketbooking.controller;
import com.example.ticketbooking.dto.TheaterDto;
import com.example.ticketbooking.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @GetMapping("/")
    public List<TheaterDto> getAllTheaters(){
        return theaterService.getAllTheaters();
    }

    @GetMapping("/location")
    public List<TheaterDto> getTheaterBasedOnLocation(@RequestParam String location){
        return theaterService.getTheaterBasedOnLocation(location);
    }

}
