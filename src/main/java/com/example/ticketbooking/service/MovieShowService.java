package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.MovieShowDto;
import com.example.ticketbooking.entity.Movie;

import java.util.List;

public interface MovieShowService {
    public List<MovieShowDto> getAllshows();
    public List<MovieShowDto> getAllShowsForMovie(Long movieId);
    public List<MovieShowDto> getAllShowsForTheater(Long movieId);
    public List<Movie> findMoviesByTheaterAndLocation(String theater , String location);
}
