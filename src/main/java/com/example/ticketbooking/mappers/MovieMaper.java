package com.example.ticketbooking.mappers;

import com.example.ticketbooking.dto.MovieDto;
import com.example.ticketbooking.entity.Movie;

public class MovieMaper {

    public static MovieDto mapToMovieDto(Movie movie , MovieDto movieDto){
        movieDto.setDescription(movie.getDescription());
        movieDto.setId(movie.getId());
        movieDto.setTitle(movie.getTitle());
        movieDto.setDuration(movie.getDuration());
        movieDto.setRating(movie.getRating());
        movieDto.setGenre(movie.getGenre());
        movieDto.setRating(movie.getRating());
        return movieDto;
    }
    public static Movie mapToMovieEntity(Movie movie , MovieDto movieDto){
        movie.setDescription(movieDto.getDescription());
        movie.setId(movieDto.getId());
        movie.setTitle(movieDto.getTitle());
        movie.setDuration(movieDto.getDuration());
        movie.setRating(movieDto.getRating());
        movie.setGenre(movieDto.getGenre());
        movie.setRating(movieDto.getRating());
        return movie;
    }
}


