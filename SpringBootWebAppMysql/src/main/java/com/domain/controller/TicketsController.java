package com.domain.controller;

import java.util.Arrays;

import java.util.List
;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.dao.TicketDao;
import com.domain.model.Ticket;

@RestController
@RequestMapping("/tickets")

public class TicketsController {

	@Autowired
	private TicketDao ticketDao;
	
	/***To Add Data into Tables****/	
	//http://localhost:8089/tickets/bookTickets
	
	@PostMapping("/bookTickets")
	public List<Ticket> bookTicket(@RequestBody Ticket ticket)
	{
		ticketDao.save(ticket);
		System.out.println("book Tickets" +ticket);
		
		return  ticketDao.findAll();
	}
	
	/***To get Data from Tables****/	
	
	@GetMapping("getTickets")
	public  List<Ticket> getTickets()
	{
		List<Ticket> ticketList=ticketDao.findAll();
		System.out.println("Get Tickets" +ticketList);

		return ticketList;
	}
	
	/*
	 * @GetMapping("/getWithoutRequestParam") public List<Object>
	 * getWithoutRequestParam(Ticket tkt) {
	 * 
	 * return Arrays.asList(tkt.getId(),tkt.getCategory(),tkt.getAmount()); }
	 */
	
	/***To get  Data  by Id from Tables****/	
	//localhost:8089/tickets/getid/25
	
	@GetMapping("getid/{id}")
	public Optional<Ticket> getTicket(@PathVariable("id") Integer id)
	{
		return ticketDao.findById(id);
	}
	
	//To Update data
	//localhost:8089/tickets/updateTickets
	
	@PutMapping("updateTickets")
	public List<Ticket> updateTicket(@RequestBody Ticket ticket)
	{
		ticketDao.save(ticket);
		
		return ticketDao.findAll();
	}

	//Delete data by Id
	//localhost:8089/tickets/delete/25
	@DeleteMapping("delete/{id}")
	public List<Ticket> deleteTickets(@PathVariable("id") Integer id)
	{
		ticketDao.deleteById(id);
		return ticketDao.findAll();
	}

}
