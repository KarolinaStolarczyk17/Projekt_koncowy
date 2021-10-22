package com.example.demo.dao;

import com.example.demo.entity.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class ClientDao {


    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Client client) {
        entityManager.persist(client);
    }

    public List<Client> findAll() {
        Query query = entityManager.createQuery("SELECT a from Client a");
        return query.getResultList();
    }


    public Client findById(Long id) {
        return entityManager.find(Client.class, id);
    }

    public void merge(Client client) {
        entityManager.merge(client);
    }

    public void remove(Client client) {
        entityManager.remove(entityManager.contains(client) ? client : entityManager.merge(client));
    }
}
