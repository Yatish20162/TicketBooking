package com.example.ticketbooking.repository;

import com.example.ticketbooking.entity.Movie;
import com.example.ticketbooking.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow , Long> {
     List<MovieShow> findByMovieId(Long Id);
     List<MovieShow> findByTheaterId(Long Id);
    @Query("SELECT ms.movie FROM MovieShow ms JOIN ms.theater t " +
            "WHERE (:theater IS NULL OR t.name = :theater) " +
            "AND (:location IS NULL OR t.location = :location)")
    List<Movie> findMoviesByTheaterAndLocation(@Param("theater") String theater,
                                               @Param("location") String location);

}
