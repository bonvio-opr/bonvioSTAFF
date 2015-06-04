package ru.ankular.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
