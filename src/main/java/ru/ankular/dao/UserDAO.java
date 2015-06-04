package ru.ankular.dao;

import ru.ankular.models.User;

import java.util.List;

/**
 * Created by niko on 03.06.15.
 */
public interface UserDAO {

    public List getAllUsers();
    public User getUserById(Integer id);
    public Integer insertUser(User user);
    public Integer deleteUserById(Integer id);
    public Integer updateUser(User user);
}