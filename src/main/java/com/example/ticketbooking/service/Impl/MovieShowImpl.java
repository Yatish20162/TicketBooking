package com.example.ticketbooking.service.Impl;

import com.example.ticketbooking.dto.MovieShowDto;
import com.example.ticketbooking.entity.Movie;
import com.example.ticketbooking.repository.MovieShowRepository;
import com.example.ticketbooking.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MovieShowImpl implements MovieShowService {
    @Autowired
    MovieShowRepository movieShowRepository;
    /**
     * @return
     */
    @Override
    public List<MovieShowDto> getAllshows() {
        return List.of();
    }

    /**
     * @param movieId
     * @return
     */
    @Override
    public List<MovieShowDto> getAllShowsForMovie(Long movieId) {
        System.out.println(movieShowRepository.findByMovieId(movieId).get(0).getMovie().getTitle());
        return List.of();
    }

    /**
     * @param movieId
     * @return
     */
    @Override
    public List<MovieShowDto> getAllShowsForTheater(Long movieId) {
        System.out.println(movieShowRepository.findByTheaterId(movieId).get(0).getMovie().getTitle());
        return List.of();
    }

    public List<Movie> findMoviesByTheaterAndLocation(String theater, String location) {
        return movieShowRepository.findMoviesByTheaterAndLocation(theater, location);
    }
}
