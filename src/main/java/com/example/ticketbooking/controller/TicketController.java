package com.example.ticketbooking.controller;

import com.example.ticketbooking.dto.PaymentDto;
import com.example.ticketbooking.dto.TicketDto;
import com.example.ticketbooking.entity.Ticket;
import com.example.ticketbooking.service.PaymentService;
import com.example.ticketbooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/")
    public List<TicketDto> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @PostMapping("/book")
    public void bookTicket(@RequestBody Ticket ticket){

    }
}
