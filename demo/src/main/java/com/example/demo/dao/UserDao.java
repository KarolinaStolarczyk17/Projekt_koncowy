package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {
    private final UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //todo dodać hashowanie hasła

    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    public User login(String email, String password) {
        User userEmail = userRepository.findByEmail(email);
        if (userEmail.getEmail().equals(email) && BScypt.checkpw(password, userEmail.getPassword())) {
            return userEmail;
        }
        return null;
    }

    public void create(User user) {
        entityManager.persist(user);

    }
}