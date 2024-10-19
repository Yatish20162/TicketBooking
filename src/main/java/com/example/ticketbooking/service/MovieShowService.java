package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.MovieShowDto;

import java.util.List;

public interface MovieShowService {
    public List<MovieShowDto> getAllshows();
    public List<MovieShowDto> getAllShowsForMovie(Long movieId);
    public List<MovieShowDto> getAllShowsForTheater(Long movieId);
}
