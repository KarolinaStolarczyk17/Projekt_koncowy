package com.example.demo.controller;

import com.example.demo.dao.ClientDao;
import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
//import com.example.demo.repository.InsuranceRepository;
import com.example.demo.repository.InsuranceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Book;
import java.util.Properties;

@Controller
public class ClientController {

    private final ClientDao clientDao;
//    private final ClientRepository clientRepository;

    public ClientController(ClientDao clientDao ) {
        this.clientDao = clientDao;
//        this.clientRepository = clientRepository;
//        this.insuranceRepository = insuranceRepository;
    }

    @GetMapping("/clientsForm/add")
    @ResponseBody
    public String addClient(Model model) {
        model.addAttribute("client", new Client());
        return "clients/form";
    }

    @PostMapping("/clientsForm/add")
    public String persistClient(@Valid Client client, BindingResult result) {
        if (result.hasErrors()) {
            return "clients/form";
        }
        clientDao.persist(client);
        return "redirect:/clientsForm/list";


    }

    @GetMapping("/clientForm/edit")
    public String prepareEdit(@RequestParam Long idToEdit, Model model) {
        model.addAttribute("client", clientDao.findById(idToEdit));
        return "clients/form";
    }

    @PostMapping("/clientForm/edit")
    public String merge(@Valid Client client, BindingResult result) {
        if (result.hasErrors()) {
            return "client/form";
        }
        clientDao.merge(client);
        return "redirect:/authorForm/list";
    }

    @GetMapping("/clientForm/remove")
    public String prepareRemove(@RequestParam Long toRemoveId, Model model) {
        model.addAttribute("client", clientDao.findById(toRemoveId));
        return "client/remove";
    }

    @PostMapping("/clientForm/remove")
    public String remove(@RequestParam String confirmed, @RequestParam Long toRemoveId) {
        if ("yes".equals(confirmed)) {
            Client client = clientDao.findById(toRemoveId);
            clientDao.remove(client);
        }
        return "redirect:/clientForm/list";
    }
    @GetMapping("/clientsForm/list")
    public String showAll(Model model) {
        model.addAttribute("allClients", clientDao.findAll());
        return "clients/all";
    }
}

