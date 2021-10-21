package com.example.demo.dao;

import com.example.demo.entity.Insurance;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.awt.print.Book;
import java.sql.Date;
import java.time.LocalDate;

@Repository
@Transactional
public class InsuranceDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Insurance insurance) {
        entityManager.persist(insurance);
    }

    public Insurance merge(Insurance insurance) {
        return entityManager.merge(insurance);
    }

    public Insurance findById(long id) {
        return entityManager.find(Insurance.class, id);
    }

    public void remove(Insurance insurance) {
        entityManager.remove(entityManager.contains(insurance) ? insurance : entityManager.merge(insurance));
    }
}