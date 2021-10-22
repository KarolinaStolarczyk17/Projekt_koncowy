package com.example.demo.repository;

import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

//    @Override
//    Optional<Client> findById(Long aLong);

//    @Override
//    public void add(Client client) {clientRepository.save(client);}

//
//    Optional<Client> findByEmail(String email);
//
//        Optional<Client> findByPesel(String pesel);
//
//        List<Client>findClientByLastName(String lastName);

//        @Query("select a from Client a where a.email like concat(:email, '%')")
//        List<Client> allClientsLikeEmail(@Param("email") String email);
//
//        @Query("select a from Client a where a.pesel like concat(:pesel, '%')")
//        List<Client> allClientsLikePesel(@Param("pesel") String pesel);



