package com.mskprojects.bookmyshow.repositories;

import com.mskprojects.bookmyshow.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Override
    Optional<Ticket> findById(Long ticketId);
    @Override
    Ticket save(Ticket ticket);
}
