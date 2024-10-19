package com.example.ticketbooking.repository;

import com.example.ticketbooking.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRepository extends JpaRepository<Theater , Long> {
    public List<Theater> getBylocation(String location);
}
