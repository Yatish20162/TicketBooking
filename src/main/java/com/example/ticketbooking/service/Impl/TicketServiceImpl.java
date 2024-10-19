package com.example.ticketbooking.service.Impl;

import com.example.ticketbooking.dto.TicketDto;
import com.example.ticketbooking.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    /**
     * @return
     */
    @Override
    public List<TicketDto> getAllTickets() {
        return List.of();
    }

    /**
     *
     */
    @Override
    public void bookTicket() {

    }
}
