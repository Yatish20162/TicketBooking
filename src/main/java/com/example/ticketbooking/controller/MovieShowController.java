package com.example.ticketbooking.controller;

import com.example.ticketbooking.dto.MovieDto;
import com.example.ticketbooking.dto.MovieShowDto;
import com.example.ticketbooking.entity.Movie;
import com.example.ticketbooking.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/available")
    public List<Movie> getAvailableMovies(@RequestParam(required = false) String theater,
                                          @RequestParam(required = false) String location) {
        return movieShowService.findMoviesByTheaterAndLocation(theater, location);
    }
}
