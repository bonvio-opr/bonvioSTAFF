package com.bonvio.staff.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by niko on 03.06.15.
 */
@Entity
@Table (name = "user")
public class User {

    public User() {
        //
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @javax.persistence.Id
    @GeneratedValue
    private Integer id;
    private String login;
    private String password;

    @OneToMany (mappedBy = "developer")
    private List <Ticket> tickets = new ArrayList<Ticket>();


    //@JsonManagedReference
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
