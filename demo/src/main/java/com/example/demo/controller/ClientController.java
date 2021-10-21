package com.example.demo.controller;

import com.example.demo.dao.ClientDao;
import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
//import com.example.demo.repository.InsuranceRepository;
import com.example.demo.repository.InsuranceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;

@Controller
public class ClientController {

    private final ClientDao clientDao;
    private final ClientRepository clientRepository;
//    private final InsuranceRepository insuranceRepository;

    public ClientController(ClientDao clientDao, ClientRepository clientRepository, InsuranceRepository insuranceRepository) {
        this.clientDao = clientDao;
        this.clientRepository = clientRepository;
//        this.insuranceRepository = insuranceRepository;
    }
@GetMapping("/client/add")

    public String addClient() {
    Client client = new Client();
//    client.setFirstName();
//    client.getLastName();
    clientDao.create(client);
    return "Id dodany klient to:"
            + client.getId();
    }
    @RequestMapping("/client/persist/{firstName}/{lastName}")
    @ResponseBody
    public String persist(@PathVariable String firstName, @PathVariable String lastName, @PathVariable String pesel, @PathVariable String email) {
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setPesel(pesel);
        client.setEmail(email);

        clientRepository.save(client);
      return "Zapisano klienta o id: " + client.getId();


 }
    @RequestMapping("/client/remove/{id}")
    @ResponseBody
    public String remove(@PathVariable("id") long id) {
        Client client = clientRepository.getById(id);
        clientRepository.delete(client);
        return "Usunieto klienta";
    }
}
