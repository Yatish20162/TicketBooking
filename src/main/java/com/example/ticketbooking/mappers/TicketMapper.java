package com.example.ticketbooking.mappers;

import com.example.ticketbooking.dto.TicketDto;
import com.example.ticketbooking.entity.Ticket;

public class TicketMapper {

    public static TicketDto mapToTicketDto(Ticket ticket , TicketDto ticketDto){
        ticketDto.setBookedAt(ticket.getBookedAt());
        ticketDto.setId(ticket.getId());
        ticketDto.setUser(ticket.getUser());
        ticketDto.setMovieShow(ticket.getMovieShow());
        ticketDto.setSeatNumber(ticket.getSeatNumber());
        ticketDto.setBookingStatus(ticket.getBookingStatus());
        return ticketDto;
    }
    public static Ticket mapToTicketEntity(Ticket ticket , TicketDto ticketDto){
        ticket.setBookedAt(ticketDto.getBookedAt());
        ticket.setId(ticketDto.getId());
        ticket.setUser(ticketDto.getUser());
        ticket.setMovieShow(ticketDto.getMovieShow());
        ticket.setSeatNumber(ticketDto.getSeatNumber());
        ticket.setBookingStatus(ticketDto.getBookingStatus());
        return ticket;
    }
}
