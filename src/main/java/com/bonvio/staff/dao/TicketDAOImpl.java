package com.bonvio.staff.dao;

import com.bonvio.staff.models.Ticket;
import com.bonvio.staff.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mil on 04.06.15.
 */
@Repository
public class TicketDAOImpl implements TicketDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Ticket> getAllTickets() {
        return entityManager.createQuery("select t from Ticket t", Ticket.class).getResultList();
    }

    @Override
    public Ticket getTicketById(Integer id) {
        return entityManager.find(Ticket.class, id);
    }

    @Override
    public Integer insertTicket(Ticket ticket) {
        entityManager.persist(ticket);
        return ticket.getId();
    }

    @Override
    public Integer deleteTicketById(Integer id) {
        Ticket ticket = entityManager.find(Ticket.class, id);
        entityManager.remove(ticket);
        return id;
    }

    @Override
    public Integer updateTicket(Ticket ticket) {
        entityManager.merge(ticket);
        return ticket.getId();
    }
}
