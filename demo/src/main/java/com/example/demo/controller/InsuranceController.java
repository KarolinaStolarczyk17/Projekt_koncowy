package com.example.demo.controller;

import com.example.demo.dao.ClientDao;
import com.example.demo.dao.InsuranceDao;
import com.example.demo.entity.Client;
import com.example.demo.entity.Insurance;
import com.example.demo.repository.InsuranceRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Book;

@Controller
public class InsuranceController {


    private final InsuranceDao insuranceDao;

    public InsuranceController(InsuranceDao insuranceDao) {this.insuranceDao = insuranceDao;}

    @GetMapping("/insuranceForm/list")
    public String insuranceList(Model model) {
        model.addAttribute("allInsuranceList", insuranceDao.findAll());
        return "insurances/all";
    }

    @GetMapping("/insuranceForm/add")
    public String initAddForm(Model model) {
        model.addAttribute("insurance", new Insurance());
        return "insurances/form";
    }

    @PostMapping("/insurancesForm/add")
    public String persistInsurance(@Valid Insurance insurance, BindingResult result) {
        if (result.hasErrors()) {
            return "insurances/form";
        }
        insuranceDao.persist(insurance);
        return "redirect:/insuranceForm/list";
    }
    @GetMapping("/insurancesForm/edit")
    public String prepareEdit(@RequestParam Long idToEdit, Model model) {
        model.addAttribute("insurance", insuranceDao.findById(idToEdit));
        return "insurances/form";
    }

    @PostMapping("/insuranceForm/edit")
    public String merge(@Valid Insurance insurance, BindingResult result) {
        if (result.hasErrors()) {
            return "insurances/form";
        }
        insuranceDao.merge(insurance);
        return "redirect:/insuranceForm/list";
    }
    @GetMapping("/insuranceForm/remove")
//    usuwanie
    public String prepareRemove(@RequestParam int toRemoveId, Model model) {
        model.addAttribute("insurance", insuranceDao.findById(toRemoveId));
        return "insurance/remove";

    }
//    @PostMapping("/insuranceForm/remove")
//    public String remove(@RequestParam String confirmed, @RequestParam int toRemoveId) {
//        if ("yes".equals(confirmed)) {
//            Insurance insurance = InsuranceDao.findById(toRemoveId);
//            InsuranceDao.remove(insurance);
//        }
//        return "redirect:/insuranceForm/list";
//    }
}
