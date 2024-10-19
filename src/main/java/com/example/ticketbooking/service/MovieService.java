package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.MovieDto;

import java.util.List;

public interface MovieService {
    public List<MovieDto> getAllMovies();
    public MovieDto getMovieDetils(Long userId);
}
