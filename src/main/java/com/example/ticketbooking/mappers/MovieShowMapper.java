package com.example.ticketbooking.mappers;

import com.example.ticketbooking.dto.MovieShowDto;

import com.example.ticketbooking.entity.MovieShow;

public class MovieShowMapper {

    public static MovieShowDto mapToMovieDto(MovieShow movieShow , MovieShowDto movieShowDto){
        movieShowDto.setMovie(movieShow.getMovie());
        movieShowDto.setId(movieShow.getId());
        movieShowDto.setShowTime(movieShow.getShowTime());
        movieShowDto.setTheater(movieShow.getTheater());
        movieShowDto.setAvailableSeats(movieShow.getAvailableSeats());
        return movieShowDto;
    }
    public static MovieShow mapToMovieEntity(MovieShow movieShow , MovieShowDto movieShowDto){
        movieShow.setMovie(movieShowDto.getMovie());
        movieShow.setId(movieShowDto.getId());
        movieShow.setShowTime(movieShowDto.getShowTime());
        movieShow.setTheater(movieShowDto.getTheater());
        movieShow.setAvailableSeats(movieShowDto.getAvailableSeats());
        return movieShow;
    }
}
