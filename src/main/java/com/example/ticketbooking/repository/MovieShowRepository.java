package com.example.ticketbooking.repository;

import com.example.ticketbooking.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow , Long> {
    public List<MovieShow> findByMovieId(Long Id);
    public List<MovieShow> findByTheaterId(Long Id);
}
