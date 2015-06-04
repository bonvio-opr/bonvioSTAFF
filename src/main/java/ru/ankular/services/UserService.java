package ru.ankular.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.ankular.models.User;

import java.util.List;

/**
 * Created by niko on 03.06.15.
 */
public interface UserService {
    public List getAllUsers();
    public User getUserById(Integer id);
    public Integer insertUser(User user);
    public Integer deleteUserById(Integer id);
    public Integer updateUser(User user);
}
