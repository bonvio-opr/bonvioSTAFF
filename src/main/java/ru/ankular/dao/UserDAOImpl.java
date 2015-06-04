package ru.ankular.dao;

import org.springframework.stereotype.Repository;
import ru.ankular.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

/**
 * Created by niko on 03.06.15.
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List getAllUsers() {
        return entityManager.createQuery("select u from User u").getResultList();
    }

    @Override
    public User getUserById(Integer id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public Integer insertUser(User user) {
        entityManager.persist(user);
        return user.getId();
    }

    @Override
    public Integer deleteUserById(Integer id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        return id;
    }

    @Override
    public Integer updateUser(User user) {
        entityManager.merge(user);
        return user.getId();
    }
}
