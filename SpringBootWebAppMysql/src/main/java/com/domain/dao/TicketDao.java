package com.domain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.model.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer> {



}
