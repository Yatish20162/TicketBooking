package com.example.ticketbooking.controller;

import com.example.ticketbooking.dto.MovieDto;
import com.example.ticketbooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public List<MovieDto> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/{movieId}")
    public MovieDto getMovie(@PathVariable Long movieId){
        return movieService.getMovieDetils(movieId);
    }
}
