package com.example.demo.dao;

import com.example.demo.entity.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class ClientDao {


    @PersistenceContext
    private EntityManager entityManager;

    public void create(Client client) {
        entityManager.persist(client);
    }

    public void edit(Client client) {
        entityManager.merge(client);
    }

//    public List<Client> projectList(Client client) {
//        return client.getClientList();
//    }

    public void addToInsurance(Client client) {
        entityManager.merge(client);
    }

    public void persist(Client client) {
        entityManager.persist(client);
    }

    public Client findById(long id) {
        return entityManager.find(Client.class, id);
    }
}
