package com.example.ticketbooking.repository;

import com.example.ticketbooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie , Long> {
    public Optional<Movie> findById(Long Id);
}
