package com.example.demo.dao;

import com.example.demo.entity.Client;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDao {
    private final UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, org.mindrot.jbcrypt.BCrypt.gensalt());
    }
//    //todo dodać hashowanie hasła

    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

//    public User login(String email, String password) {
//        User userEmail = userRepository.findByEmail(email);
//        if (userEmail.getEmail().equals(email) && BCrypt.checkpw(password, userEmail.getPassword())) {
//            return userEmail;
//        }
//        return null;
//    }

    public void create(User user) {
        entityManager.persist(user);

    }

    public User merge(User user) {
        return entityManager.merge(user);
    }


    public void persist(User user) {
        entityManager.persist(user);
    }

    public void remove(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
    public List<User> findAll() {
        Query query = entityManager.createQuery("SELECT a from User a");
        return query.getResultList();
    }
}