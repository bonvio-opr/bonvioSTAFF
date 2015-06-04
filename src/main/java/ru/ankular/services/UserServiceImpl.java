package ru.ankular.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.ankular.dao.UserDAO;
import ru.ankular.models.User;

import java.util.List;

/**
 * Created by niko on 03.06.15.
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserDAO userDao;

    @Override
    public List getAllUsers() {
        System.out.println("получение юзеров всех");
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public Integer insertUser(User user) {
        System.out.println("сохранение юзера");
        userDao.insertUser(user);
        return user.getId();
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return null;
    }

    @Override
    public Integer updateUser(User user) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
