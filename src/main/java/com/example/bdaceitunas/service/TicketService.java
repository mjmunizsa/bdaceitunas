package com.example.bdaceitunas.service;

import com.example.bdaceitunas.entity.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TicketService {

	Page<Ticket> findAll(Pageable pag);
}
