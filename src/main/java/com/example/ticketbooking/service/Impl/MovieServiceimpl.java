package com.example.ticketbooking.service.Impl;

import com.example.ticketbooking.dto.MovieDto;
import com.example.ticketbooking.entity.Movie;
import com.example.ticketbooking.mappers.MovieMaper;
import com.example.ticketbooking.repository.MovieRepository;
import com.example.ticketbooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceimpl implements MovieService {
    /**
     * @return
     */
    @Autowired
    MovieRepository movieRepository;
    @Override
    public List<MovieDto> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtoList = new ArrayList<>();
        for(Movie movie : movies){
            MovieDto movieDto = new MovieDto();
            movieDto = MovieMaper.mapToMovieDto(movie , movieDto);
            movieDtoList.add(movieDto);
        }
        return movieDtoList;
    }

    /**
     * @param movieId
     * @return
     */
    @Override
    public MovieDto getMovieDetils(Long movieId) {
        Optional<Movie> movie = movieRepository.findById(movieId);
        MovieDto movieDto = new MovieDto();
        movie.ifPresent(value -> MovieMaper.mapToMovieDto(value, movieDto));
        return movieDto;
    }
}
