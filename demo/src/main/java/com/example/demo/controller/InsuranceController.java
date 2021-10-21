package com.example.demo.controller;

import com.example.demo.dao.ClientDao;
import com.example.demo.entity.Client;
import com.example.demo.entity.Insurance;
import com.example.demo.repository.InsuranceRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;

@Controller
public class InsuranceController {

    private final ClientDao clientDao;
    private final InsuranceRepository insuranceRepository;

    public InsuranceController(ClientDao clientDao, InsuranceRepository insuranceRepository ) {

        this.clientDao = clientDao;
        this.insuranceRepository = insuranceRepository;
    }

        @RequestMapping("/insurance/remove/{id}")
        @ResponseBody
        public String remove ( @PathVariable("id") long id){
            Insurance insurance = insuranceRepository.getById(id);
            insuranceRepository.delete(insurance);
            return "Usunieto polise";
        }
    @RequestMapping("/insurance/findById/{id}")
    @ResponseBody
    public String findById(@PathVariable("id") long id) {
        Insurance insurance = insuranceRepository.getById(id);
        return insurance.toString();
    }
    @RequestMapping("/insurance/persist")
    @ResponseBody
    public String persist() {
        Client client = new Client();
        client.setLastName("Kowalski");
        clientDao.persist(client);

        Client firstClient = clientDao.findById(1);
        Client secondClient = clientDao.findById(2);

        Insurance insurance = new Insurance();
        insurance.setInsuranceNumber(12345897);
//        insurance.setInsuranceActive ("FALSE");
        insurance.setInsurancePrice(1500);
        insurance.getClientList().add(firstClient);
        insurance.getClientList().add(secondClient);

        insuranceRepository.save(insurance);
        return "Zapisano polise o id: " + insurance.getId();
    }
    }
