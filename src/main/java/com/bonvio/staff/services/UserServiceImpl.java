package com.bonvio.staff.services;

import com.bonvio.staff.dao.UserDAO;
import com.bonvio.staff.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by niko on 03.06.15.
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserDAO userDao;

    //@Transactional
    @Override
    public List<User> getAllUsers() {
        System.out.println("получение юзеров всех");
        return userDao.getAllUsers();
    }

    //@Transactional
    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Transactional
    //@Override
    public Integer insertUser(User user) {
        System.out.println("сохранение юзера");
        userDao.insertUser(user);
        return user.getId();
    }

    @Transactional
    //@Override
    public Integer deleteUserById(Integer id) {
        return null;
    }

    @Transactional
    //@Override
    public Integer updateUser(User user) {
        return null;
    }

    //@Transactional
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
