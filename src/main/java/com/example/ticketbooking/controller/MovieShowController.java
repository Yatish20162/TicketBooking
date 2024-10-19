package com.example.ticketbooking.controller;

import com.example.ticketbooking.dto.MovieShowDto;
import com.example.ticketbooking.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/show")
public class MovieShowController {

    @Autowired
    MovieShowService movieShowService;

    @GetMapping("/")
    public List<MovieShowDto> getAllShows(){
        return movieShowService.getAllshows();
    }

    @GetMapping("movie/{movieId}")
    public List<MovieShowDto> getAllShowsForMovie(@PathVariable Long movieId){
        return movieShowService.getAllShowsForMovie(movieId);
    }

    @GetMapping("theater/{theaterId}")
    public List<MovieShowDto> getAllShowsForTheater(@PathVariable Long theaterId){
        return movieShowService.getAllShowsForTheater(theaterId);
    }
}
