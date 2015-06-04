package com.bonvio.staff.controllers;

import com.bonvio.staff.models.Ticket;
import com.bonvio.staff.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mil on 04.06.15.
 */

@Controller
@RequestMapping("ticket")
public class TicketController {

    @RequestMapping(method = RequestMethod.GET)
    public String main() {
        return "ticket";
    }

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/getTickets", method = RequestMethod.GET)
    @ResponseBody
    public List<Ticket> getAllUsers() {
        return ticketService.getAllTicket();
    }

    @RequestMapping(value = "/insertTicket", method = RequestMethod.POST)
    @ResponseBody
    public Ticket insertTicket(@RequestBody Ticket ticket) {
        ticketService.insertTicket(ticket);
        return ticket;
    }

    @RequestMapping(value =  "/deleteTicketById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteTicketById(@PathVariable("id") Integer id) {
        ticketService.deleteTicketById(id);
        return id;
    }

}
