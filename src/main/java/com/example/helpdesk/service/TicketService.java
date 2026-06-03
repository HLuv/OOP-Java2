package com.example.helpdesk.service;

import com.example.helpdesk.DTO.TicketCreateDTO;
import com.example.helpdesk.model.Ticket;

import java.util.List;

public interface TicketService {

    Ticket createTicket(TicketCreateDTO ticketCreateDto);
    List<Ticket> getAllTickets();
    Ticket getTicketById(Long id);
}
