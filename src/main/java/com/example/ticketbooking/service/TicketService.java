package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.TicketDto;

import java.util.List;

public interface TicketService {
    public List<TicketDto> getAllTickets();
    public void bookTicket();

}
